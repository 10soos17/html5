package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InitParam")
public class InitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String dirPath = getInitParameter("dirPath");
		String userid = getInitParameter("userid");
		
		response.setContentType("text/html; charset=utf-8");// get
		String driver = getServletContext().getInitParameter("driver");
		String savePath = getServletContext().getInitParameter("savePath");
		System.out.println(driver);
		System.out.println(savePath);

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("저장경로: " + dirPath + "<br>");
		out.println("사용자 : " + userid + "<br>");
		out.println("</html></body>");
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
