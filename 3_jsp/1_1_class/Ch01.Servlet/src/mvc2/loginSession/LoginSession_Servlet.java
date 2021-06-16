package mvc2.loginSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login/logininSession")
public class LoginSession_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");//post諛⑹떇�뿉�꽌 異붽� 
		response.setContentType("text/html; charset=utf-8");//get諛⑹떇�뿉�꽌 異붽� 
		
		String id = request.getParameter("id");
		String pass = request.getParameter("passwd");
	
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		//http://localhost:8080/Ch01.Servlet/login/logininSession
		RequestDispatcher d = request.getRequestDispatcher("../menu.jsp");// /manu.jsp
		d.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
