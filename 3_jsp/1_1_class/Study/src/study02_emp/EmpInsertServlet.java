package study02_emp;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/study02/EmpInsert")
public class  EmpInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");//post諛⑹떇�뿉�꽌 異붽� 
		response.setContentType("text/html; charset=utf-8");//get諛⑹떇�뿉�꽌 異붽� 
		
		String name;
		int id, salary,dept;
		int result;
		processDB db = new processDB();
	
		id = Integer.parseInt(request.getParameter("id"));
		name = request.getParameter("name");
		salary = Integer.valueOf(request.getParameter("salary").trim());
		dept = Integer.parseInt(request.getParameter("dept"));
		
	
		processDB.getConnection();
		result = db.insertEmp(id,name,dept,salary);
		
		PrintWriter out = response.getWriter();
		
		if(result > 0) {
			//db.selectEmp();
			out.write("<h3>결과:성공<br>");
			out.write("</h3><br>");
			
		}else {
			out.write("<h3>결과:실패<br>");
			out.write("</h3><br>");
		}
		
		//화면출력1
//		PrintWriter out = response.getWriter();
//		out.write("<h3>계산 결과:<br>");
//		out.write(result+"</h3><br>");
//		
//		//자바스트립트
//		out.println("<script>");
//		out.ptintln(result);
//		out.println("history.back()");
//		out.println("</script>");
//		
	}

}
