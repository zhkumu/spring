package test.Time;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

import javax.enterprise.inject.New;

public class MyTimeTask extends TimerTask {

	@Override
	public void run() {
		SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss:SSS");
		System.out.println("这是jdk定时任务: "+format.format(new Date()));
	}

}
