package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcController
 */
@WebServlet("/calcControl")
public class CalcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public CalcController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// 첫번째 입력 필드 이름
				int n1= Integer.parseInt(request.getParameter("n1"));
				
				// 두 번째 입력 필드 이름
				int n2= Integer.parseInt(request.getParameter("n2"));
				
				//연산자 값
				String op = request.getParameter("op");
				// 연산결과 반환
////				
//				long result=0;
//				switch(op) {
//				case "+": result= n1+n2; break;
//				case "-": result= n1-n2; break;
//				case "*": result= n1*n2; break;
//				case "/":result = n1/n2; break;
//				
				Calculator c = new Calculator();
				long result = c.calc(n1,n2,op);
//				
//				
//				}
//				
				request.setAttribute("result", result); // result값을 
				getServletContext().getRequestDispatcher("/ch08/calcResult.jsp")
				.forward(request, response); //포워딩을 시켜서 요청받은 값 n1, n2,op을 보냄.
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
