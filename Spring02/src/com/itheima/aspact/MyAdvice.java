package com.itheima.aspact;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//表示该类是通知类
@Aspect // <bean name="myAdvice" class="com.itheima.aspact.MyAdvice"></bean>
		// <aop:aspect ref="myAdvice">
public class MyAdvice {
	@Pointcut("execution(* com.itheima.service.impl.*ServiceImpl.*(..))")
	//<aop:pointcut
	//expression="execution(* com.itheima.service.impl.*ServiceImpl.*(..))"id="pc"/>
	public void pc() {}

	// 前置通知
	@Before("MyAdvice.pc()")
	// <aop:before method="before" pointcut-ref="pc"/>
	public void before() {
		System.out.println("前置通知");
	}

	// 后置通知（出现异常不会调用）
	@AfterReturning("MyAdvice.pc()")
	// <aop:after-returning method="afterReturning" pointcut-ref="pc"/>
	public void afterReturning() {
		System.out.println("后置通知（出现异常不会调用）");
	}

	// 环绕通知
	@Around("MyAdvice.pc()")
	// <aop:around method="around" pointcut-ref="pc"/>
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知前");
		Object proceed = pjp.proceed();
		System.out.println("环绕通知后");
		return proceed;
	}

	// 异常拦截通知
	@AfterThrowing("MyAdvice.pc()")
	// <aop:after-throwing method="afterException" pointcut-ref="pc"/>
	public void afterException() {
		System.out.println("异常拦截通知");
	}

	// 后置通知（出现异常也会调用）
	@After("MyAdvice.pc()")
	// <aop:after method="after" pointcut-ref="pc"/>
	public void after() {
		System.out.println("后置通知（出现异常也会调用）");
	}
}
