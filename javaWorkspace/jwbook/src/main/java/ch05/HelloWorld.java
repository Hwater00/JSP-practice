package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet(description = "My first servlet", urlPatterns = { "/hello" }) //애너테이션 서블릿 선언: @WebServlet
// description = "My first servlet"은 서블렛에 대한 간단한 설명, 
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HelloWorld() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html; charset=utf8");
		PrintWriter out  = response.getWriter();
		out.append("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Hello World</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<h2")
		.append("<h2>Hello World</h2><hr>현재 날자와 시간은"+java.time.LocalDateTime.now())
		.append("</body>\r\n"
				+ "</html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
