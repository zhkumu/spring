package test.Time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringTimer {
	public void show(){
		SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss:SSS");
		System.out.println("这是spring定时任务: "+format.format(new Date()));
	}
}
