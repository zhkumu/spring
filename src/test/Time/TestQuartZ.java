package test.Time;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.ScheduleBuilder;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;




public class TestQuartZ {

	public static void main(String[] args) throws SchedulerException, IOException {
		
		JobDataMap map=new JobDataMap();
		map.put("username", "mu");
		Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler(); 
		          
		scheduler.start();    
		JobDetail job = JobBuilder.newJob(MyJob.class).withIdentity("job1", "group1").setJobData(map)
							.build();    
		
		Trigger trigger = TriggerBuilder.newTrigger()
				.withIdentity("trigger1", "group1")
				.startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever()).build(); 
		  
		scheduler.scheduleJob(job, trigger);
		
		//scheduler.shutdown();
		InputStream in= System.in;
		in.read();

	}

}
