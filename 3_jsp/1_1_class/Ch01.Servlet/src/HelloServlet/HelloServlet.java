package HelloServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet 사용법
//1.annotation 방식(new) 
//2..xml 방(old)

//@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//post��Ŀ��� �߰�
		response.setContentType("text/html; charset=utf-8");//get��Ŀ��� �߰�
		
		PrintWriter out = response.getWriter();
		out.write("<h3>hello</h3>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
