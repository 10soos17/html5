package op;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/study01/Calc1")
public class CalcServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");//post諛⑹떇�뿉�꽌 異붽� 
		response.setContentType("text/html; charset=utf-8");//get諛⑹떇�뿉�꽌 異붽� 
		
		int n1;
		int n2;
		int result;
		String op;
	
		n1 = Integer.parseInt(request.getParameter("num1"));
		n2 = Integer.parseInt(request.getParameter("num2"));
		op = request.getParameter("op");
		
		result = calc(n1, n2, op);
		System.out.println("계산 결과");
		
		//화면출력1
		PrintWriter out = response.getWriter();
		out.write("<html><head><title>계산기:</title></head><body><h2>계산결과</h2><hr>");
		out.write(n1+op+n2+" = "+result);

	}
	//사칙연산메소드
	public int calc(int n1, int n2, String op) {
		int result = 0;
		switch(op) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			result = (int)(n1 /n2);
			break;
		}
		
		return result;
	}

}
