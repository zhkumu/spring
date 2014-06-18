package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("aop.xml");
		TestService service=(TestService)applicationContext.getBean("testService");
		service.Test();
	}

}
