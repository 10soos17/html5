package std3_xml;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/std3/member1")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
		request.setCharacterEncoding("utf-8");// post
		response.setContentType("text/html; charset=utf-8");// get

		PrintWriter out = response.getWriter();
		Enumeration<String> enu = request.getParameterNames();

		out.println("<html><body>");

		while (enu.hasMoreElements()) {
			String name = enu.nextElement(); // name
			String value = request.getParameter(name); // value: name에 들어있는 값
			out.print(name + " : " + value + "<br>");

		}

		String action = request.getParameter("action");
		out.println("action: " + action);
		out.println("</body></html>");
	}

}
