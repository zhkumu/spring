package test.Time;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;


public class SpringTask {
	
	@Scheduled(fixedDelay=5000)
	public void show(){
		SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss:SSS");
		System.out.println("spring task 定时 "+format.format(new Date()));
	}
}
