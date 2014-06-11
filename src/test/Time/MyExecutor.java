package test.Time;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MyExecutor{
	private Executor executor;
	public MyExecutor(Executor executor){
		this.executor=executor;
	}
	
	public void executeTask(){
		executor.execute(new ExecutorTest());
	}
	
	public static void main(String[] args) throws IOException {
		ScheduledThreadPoolExecutor executor=(ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(10);
		InputStream in= System.in;
		in.read();
	}
	
	
}
class ExecutorTest implements Runnable{

	@Override
	public void run() {
		SimpleDateFormat format=new SimpleDateFormat("hh:mm:ss:SSS");
		System.out.println("executor 定时 "+format.format(new Date()));
	}
}
