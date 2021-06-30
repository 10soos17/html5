package a.a.a;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tttt")
public class Test2 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//req.setCharacterEncoding("utf-8");// post
		res.setContentType("text/html; charset=utf-8");// get
		
		System.out.println("하하하~!");
		res.getWriter().println("<!DOCTYPE html>");
		res.getWriter().println("<html>");
		res.getWriter().println("<body>");
		res.getWriter().println("Hello~!!!");

		String score = req.getParameter("score");
		int value = Integer.parseInt(score);

		//DB 연동 ... 코드를 사용 ...SELECT, INSERT, DELETE, UPDATE
		
		if (value > 90) {
			res.getWriter().println("A학점입니다.");
		} else if (value > 80) {
			res.getWriter().println("B학점입니다.");
		} else {
			res.getWriter().println("C학점입니다.");
		}

		res.getWriter().println("</body>");
		res.getWriter().println("</html>");
	}

}
