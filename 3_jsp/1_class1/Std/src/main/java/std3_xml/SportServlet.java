package std3_xml;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/std3/sport1")
public class SportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");// post
		response.setContentType("text/html; charset=utf-8");// get

		String sport[] = request.getParameterValues("sport");
		String sex = request.getParameter("sex");

		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("좋아하는 운동은: <br>");
		
		for (String str : sport) {
			out.println(str+"<br>");
		}
		
		out.println("성별은: " + sex);
		out.println("</body></html>");
//		RequestDispatcher d = request.getRequestDispatcher("../sportRes.jsp");// /manu.jsp
//		d.forward(request, response);

	}

}
