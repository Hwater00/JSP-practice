package ch11;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ListenerTestServlet
 */
@WebServlet("/ListenerTestServlet")
public class ListenerTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletContext sc;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void init(ServletConfig config) throws ServletException {
        super.init(config); //init 메소드는 서블릿의 초기화 과정에서 호출
        sc= getServletContext();
 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HTTP GET 요청을 처리하는 부분입니다
		sc.setAttribute("sname","김길동"); // sevletContext 객체(sc)에 속성이 추가되는 것이므로, ServletContextAttributeEvent 이벤트가 생성
		HttpSession s = request.getSession(); // 세션 생성
		s.setAttribute("cname", s.getId()+"세션 속성 저장");
		// ServletContext에 'sname' 속성으로 "김길동"을 설정하고, 세션을 얻어와 'cname' 속성으로 세션 ID와 문자열을 설정합니다.
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
