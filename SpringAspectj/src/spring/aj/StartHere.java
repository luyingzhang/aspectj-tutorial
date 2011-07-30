package spring.aj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartHere {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		SwimInterface bc = (SwimInterface) context.getBean("swimClass");
		bc.holdBreath();
	}

}
