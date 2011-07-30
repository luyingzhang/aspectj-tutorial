package spring.aj;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

@WebServlet("/StartHereServlet")
public class StartHereServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StartHereServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); 
        response.getWriter().print( "我是老闆，程式寫好了沒?... " + work() );//
	}

	private String work(){
	    
	    ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
	    ASpringBean bean = (ASpringBean)context.getBean("aSpringBean");
	    
	    return bean.nag();
	}
}
