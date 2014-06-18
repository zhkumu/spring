package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectAdvice2 {
	
	@Pointcut("execution(* aop.*.*(..))")
    public void anyMethod() {
    }

	
	@Before(value="execution(* aop.*.*(..))")
	public void before(JoinPoint jp){
		System.out.println("before2");
		System.out.println(jp.getSignature().getName());
	}
	
	@After(value="execution(* aop.*.*(..)) &&" +" args(result,..)")
	public void after(JoinPoint jp,String result){
		System.out.println("after2");
		System.out.println(jp.getSignature().getName());
		System.out.println(result);
	}
	
	@Around(value="execution(* aop.*.*(..))")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around12");
		pjp.proceed();
		System.out.println("around22");
	}
	
	public void thorw(JoinPoint jp,Throwable e){
		System.out.println("throw");
		System.out.println(e.getMessage());
	}
}
