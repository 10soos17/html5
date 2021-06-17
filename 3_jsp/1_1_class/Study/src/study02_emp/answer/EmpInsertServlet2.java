package study02_emp.answer;

import study02_emp.processDB1;

import java.io.IOException;
import java.lang.ClassNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.webkit.theme.Renderer;

@WebServlet("/study02/answer/EmpInsert3")
public class EmpInsertServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		int empno = Integer.parseInt(request.getParameter("emp_id"));
		String ename = request.getParameter("ename");
		int sal = Integer.parseInt(request.getParameter("salary"));
		int deptno = Integer.parseInt(request.getParameter("depart"));

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");

		processDB1 pdb = new processDB1();
		int n = pdb.insertEmp(empno, ename, sal, deptno);

		if (n >= 1) {

			out.println("저장성공");

			ArrayList<Object> res = pdb.selectEmp();
			String s ="";
			for (int i = 0; res.size() > i; i++) {
				
				
				s+=res.get(i);
				
				String []tokens=s.split(",");
				
				for(int j=0;j<tokens.length;j++){
					System.out.println(tokens[j]);
				}
				
			}
			out.println("</body></html>");

		} else {
			out.println("저장실패");
		}
	}

}