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

@WebListener
public class ListenerExam implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener {

   
    public ListenerExam() {
      
    }


    public void attributeAdded(ServletContextAttributeEvent event)  { 
         event.getServletContext().log("ServlerContext 속성 추가:"+ event.getValue());
    }

    public void attributeReplaced(ServletContextAttributeEvent event)  { 
        
    }
    public void attributeRemoved(ServletContextAttributeEvent event)  { 
         // TODO Auto-generated method stub
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
        sce.getServletContext().log("ServletContext 시작됨");
   }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
        sce.getServletContext().log("ServletCnontent 종료됨");
    }

    
    public void sessionCreated(HttpSessionEvent se)  { 
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
