package answer;

import study02_emp.processDB2_SELF;

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
import java.util.StringTokenizer;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/study02/answer/EmpInsertSELF")
public class EmpInsertServlet2_SELF extends HttpServlet {
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

		processDB2_SELF pdb = new processDB2_SELF();
		int n = pdb.insertEmp(empno, ename, sal, deptno);

		if (n >= 1) {

			out.println("저장성공<br>");

			// ArrayList.add(Arrays.asList())로 만든 ArrayList 배열 값 추출할때 
			// Arrays.asList()를 List 클래스에 담아서 값 읽기 
			ArrayList<Object> totalList = pdb.selectEmp();

			for (int i = 0; i < totalList.size(); i++) {

				List onelist = (List) totalList.get(i);

				out.println("["+(i+1)+"th Employee]<br>"+
								"empno: "+onelist.get(0)+", "+
								"ename: "+onelist.get(1)+", "+
								"sal: "+onelist.get(2)+", "+
								"deptno: "+ onelist.get(3)+"<br>");
			}

			
		} else {
			out.println("저장실패<br>");
		}

		out.println("</body></html>");

	}
		

}
