package application;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//application: server가 시작부터 종료까지 싸이클: 방문자수 

@WebServlet("/ContextParamServlet")
public class ContextParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");// post
		response.setContentType("text/html; charset=utf-8");// get
		String driver = getServletContext().getInitParameter("driver");
		String savePath = getServletContext().getInitParameter("savePath");
		System.out.println(driver);
		System.out.println(savePath);

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("드라이버명: " + driver + "<br>");
		out.println("저장경로: " + savePath + "<br>");
		out.println("</html></body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
