package test.Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringTask {
	public void show(){
		SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss:SSS");
		System.out.println("spring task 定时 "+format.format(new Date()));
	}
}
