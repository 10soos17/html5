
package mvc.login;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login/login")
public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response.setContentType("text/html);
		//response.setCharacterEncoding("utf-8");
		//����ǥ��
		response.setContentType("text/html; charset=utf-8");
		
		String id = request.getParameter("id");
		String pass = request.getParameter("passwd");
		
		//java ���
		System.out.println("id: "+id+"\npasswd: "+pass);
		
		//out.println("id: "+id+"\npasswd: "+pass);
		
		//ȭ�����(web)
		PrintWriter out = response.getWriter();
		out.write("<h3>���̵�: "+id+"<br>");
		out.write("passwd: "+pass+"<br>");
		out.write("</h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
