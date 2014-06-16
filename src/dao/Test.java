package dao;


import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.aspectj.weaver.patterns.HasMemberTypePattern;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xml.User;

public class Test {
 
	public static void main(String[] args) {
		PropertyConfigurator.configure("E:\\work\\rd2\\tdzx3.0\\web\\trunk\\src_sub\\GuanLi\\WebRoot\\WEB-INF\\classes\\log4j.properties");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dao.xml");
		SystemUserDao dao=(SystemUserDao)applicationContext.getBean("systemUserDao");
		
		System.out.println(dao.getUsersCount());
		
	}
}
