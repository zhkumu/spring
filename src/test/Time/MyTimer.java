package test.Time;

import java.io.IOException;
import java.io.InputStream;
import java.util.Timer;

import org.apache.poi.hssf.util.HSSFColor.YELLOW;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTimer {
	public static void main(String[] args) throws IOException {
		/*Timer timer=new Timer(true);
		MyTimeTask task=new MyTimeTask();
		timer.schedule(task, 1000, 2000);
		InputStream in= System.in;
		in.read();*/
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("time.xml");
		InputStream in= System.in;
		in.read();
		
		
	}
}
