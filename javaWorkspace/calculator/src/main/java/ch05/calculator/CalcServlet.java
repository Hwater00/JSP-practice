package ch05.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath()); response 값이 들어오기 때문에 해당 코드로 인해 인코딩 오류 발생
		// 첫번째 입력 필드 이름
		int n1= Integer.parseInt(request.getParameter("n1"));
		
		// 두 번째 입력 필드 이름
		int n2= Integer.parseInt(request.getParameter("n2"));
		
		//연산자 값
		String op = request.getParameter("op");
		// 연산결과 반환
		
		long result=0;
		switch(op) {
		//switch(request.getParameter("op")) {
		case "+": result= n1+n2; break;
		case "-": result= n1-n2; break;
		case "*": result= n1*n2; break;
		case "/":result = n1/n2; break;
		
		}
		
		response.setContentType("text/html; charset=utf8");
		PrintWriter out  = response.getWriter();
		out.append("<html><body><h2>계산기 서블릿</h2><hr>")
		.append("계산 결과: "+result+"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
