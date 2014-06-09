package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:spring.xml");
		Boss boss=(Boss) applicationContext.getBean("boss");
		System.out.println(boss.getCards().get("tow"));
		List<String> list=(ArrayList<String>)applicationContext.getBean("mylist");
		System.out.println(list.get(1));
		Son son=(Son) applicationContext.getBean("son");
		System.out.println(son.getCar().getMoney());
		Student student=(Student)applicationContext.getBean("student2");
		System.out.println(student.getName());
		String[] str=new String[3];
	}

}
