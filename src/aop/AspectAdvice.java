package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectAdvice {
	
	public void before(JoinPoint jp){
		System.out.println("before");
		System.out.println(jp.getSignature().getName());
	}
	
	public void after(JoinPoint jp,String result){
		System.out.println("after");
		System.out.println(jp.getSignature().getName());
		System.out.println(result);
	}
	
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around1");
		pjp.proceed();
		System.out.println("around2");
	}
	
	public void thorw(JoinPoint jp,Throwable e){
		System.out.println("throw");
		System.out.println(e.getMessage());
	}
}
