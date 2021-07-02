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

//http://localhost:8080/SimpleMVC/getBooks.do
//http://localhost:8080/SimpleMVC/createBook.do?bookname=qwer&publisher=qqqq&price=7000 
//한글 안 깨지게 하려면 post 방식이 안전 or 글자 엔코딩 방식 바꿔주기 
@WebServlet("*.do")
public class CommandDispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String command = request.getRequestURI();
		//"/SimpleMVC/getBooks.do"
		if (command.equals("/SimpleMVC/getBooks.do")) {
			BookService bookService = new BookService();
			ArrayList<BookVO> list = bookService.getBooks();

			request.setAttribute("abcd", list);

			// 포워딩 ... forwarding 
			//만일 forward대신 redirect하면 request 속성 저장공간이 소멸됨
			//만일 session 속성으로 저장하면 값이 남기는 하지만, 쓸데없이 저장공간을 사용하게 됨 
			request.getRequestDispatcher("/WEB-INF/views/getBooks.jsp").forward(request, response);

		} else if (command.equals("/SimpleMVC/createBook.do")) {

			String bookname = request.getParameter("bookname");
			String publisher = request.getParameter("publisher");
			int price = Integer.parseInt(request.getParameter("price"));

			BookService bookService = new BookService();
			bookService.createBook(bookname, publisher, price);

			// 리다이렉트 ...
			response.sendRedirect("./getBooks.do");
			
			//포워딩하면 값 안나옴()
			//request.getRequestDispatcher("/WEB-INF/views/getBooks.jsp").forward(request, response);


		} else if (command.equals("/SimpleMVC/login.do")) {
			// ...
		}else if(command.equals("/SimpleMVC/createBookForm.do")){
			request.getRequestDispatcher("/WEB-INF/views/createBookForm.jsp").forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
