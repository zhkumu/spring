package test.Time;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.inject.New;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobDataMap map= context.getJobDetail().getJobDataMap();
		
		SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss:SSS");
		System.out.println("quartz 手工任务 "+map.getString("username") +" 时间 " +format.format(new Date()));
	}

}
