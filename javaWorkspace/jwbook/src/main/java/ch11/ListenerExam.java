package ch11;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener // 컨테이너야! 내가 리스너 클래스야! 
public class ListenerExam implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener {
//ServletContextListener 톰캣의 시작 종료 이벤트 동작 리스너 인터페이스를 박음.
   
    public ListenerExam() {
      
    }


    public void attributeAdded(ServletContextAttributeEvent event)  {  // 김길동 속성 추가-> ServletContext의 속성이 추가될 때 호출-> event에 값
    	System.out.println(event); // 이벤트 객체가 매개변수
         event.getServletContext().log("ServlerContext 속성 추가:"+ event.getValue()); // 속성의 값을 로깅
    }

    public void attributeReplaced(ServletContextAttributeEvent event)  { 
        
    }
    public void attributeRemoved(ServletContextAttributeEvent event)  { 
         // TODO Auto-generated method stub
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	
    public void contextInitialized(ServletContextEvent sce)  { // contextInitialized
        sce.getServletContext().log("ServletContext 시작됨");
   }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
        sce.getServletContext().log("ServletCnontent 종료됨");
    }

    
    public void sessionCreated(HttpSessionEvent se)  {  // HttpSession
        se.getSession().getServletContext().log("섹션 생성됨:"+se.getSession().getId());
   }

    
    public void attributeAdded(HttpSessionBindingEvent event)  { 
    	event.getSession().getServletContext().log("섹션 속성 추가:"+event.getValue());
    }

	
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    }

	
    public void attributeReplaced(HttpSessionBindingEvent event)  { 
         // TODO Auto-generated method stub
    }

  

  
	
}
