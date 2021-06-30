package com.ja.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ja.service.BookService;
import com.ja.vo.BookVO;

@WebServlet("*.do")
public class CommandDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String command = request.getRequestURI();

		if (command.equals("/SimpleMVC/getBooks.do")) {
			BookService bookService = new BookService();
			ArrayList<BookVO> list = bookService.getBooks();

			request.setAttribute("abcd", list);

			// 포워딩 ... forwarding
			request.getRequestDispatcher("/WEB-INF/views/getBooks.jsp").forward(request, response);

		} else if (command.equals("/SimpleMVC/createBook.do")) {

			String bookname = request.getParameter("bookname");
			String publisher = request.getParameter("publisher");
			int price = Integer.parseInt(request.getParameter("price"));

			BookService bookService = new BookService();
			bookService.createBook(bookname, publisher, price);

			// 리다이렉트 ...
			response.sendRedirect("./getBooks.do");

		} else if (command.equals("/SimpleMVC/login.do")) {
			// ...
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
