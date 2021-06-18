package mvc2.loginSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login/login2")
public class Login2_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//request.setCharacterEncoding("utf-8");//post��Ŀ��� �߰�
		response.setContentType("text/html; charset=utf-8");//get��Ŀ��� �߰�
		//id:java, pass: java
		
		String id = request.getParameter("id");
		String pass = request.getParameter("passwd");
	
		HttpSession session = request.getSession();
		
		if(id.equals("java") && pass.equals("java")) {
				session.setAttribute("id", id);
				session.setAttribute("passwd", pass);
				
				RequestDispatcher d = request.getRequestDispatcher("/logout/loginSuccess.jsp"); //or ../ or ~/
				d.forward(request, response);
				
		}else {
			
			System.out.println("���̵� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			
			//ȭ�����1
			PrintWriter out = response.getWriter();
			out.write("<h3>���̵� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.</h3><br>");
			
			//�ڹٽ�Ʈ��Ʈ
			out.println("<script>");
			out.println("alert('���̵� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.')");
			out.println("history.back()");
			out.println("</script>");
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}