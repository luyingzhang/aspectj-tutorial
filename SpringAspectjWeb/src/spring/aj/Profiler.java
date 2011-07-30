package spring.aj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Profiler {

	@Pointcut("execution(* spring.aj.*.*(..))")
	public void manage() {	}

	@Around("manage()")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		System.out.println("工作開始前，我要先上廁所!");
		
		Object output = pjp.proceed();
		
		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("工作結束，總共歷時: " + elapsedTime + " 毫秒!");
		return output;
	}

}
