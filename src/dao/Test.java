package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dao.xml");
		SystemUserDao dao=(SystemUserDao)applicationContext.getBean("systemUserDao");
		dao.insertUser("test1", "123");
		System.out.println(dao.getUsers());
	}
}
