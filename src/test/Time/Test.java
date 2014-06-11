package test.Time;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws IOException {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("time.xml");
		
		InputStream in= System.in;
		in.read();
	}

}
