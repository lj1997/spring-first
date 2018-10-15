package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@Aspect
public class aspect1 {

	@Pointcut("execution(* pojo1.role.test(..))")
	public void fun() {
		
	}
	@Before("fun()")
	public void before() {
		System.out.println("before...");
	}
	@After("execution(* pojo1.role.test(..))&&args(h)")
	public void after(int h) {
		System.out.println("after..."+h);
	}
	@AfterReturning("fun()")
	public void afterrunning() {
		System.out.println("afterrunning...");
	}
	
}
