package spring.aj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Profiler {

	//範圍是 spring.aj 下的所有 class 的所有 method
	@Pointcut("execution(* spring.aj.*.*(..))")
	public void scope() {	}

	@Around("scope()")
	public Object profile(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		System.out.println("要準備閉氣了，先吸一大口氣。");

		Object output = pjp.proceed();
		
		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("總共歷時: " + elapsedTime + " 毫秒。");
		return output;
	}

}
