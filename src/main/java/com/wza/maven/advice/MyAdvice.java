package com.wza.maven.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void before(){
		System.out.println("+++++++前置方法+++++++");
	}
	public void afterReturning(){
		System.out.println("=====后置方法=====");
	}
	public Object around(ProceedingJoinPoint point) throws Throwable{
		System.out.println("环绕通知之前");
		Object object = point.proceed();
		System.out.println("环绕通知之后");
		return object;
	} 
	public void afterException(){
		System.out.println("后置异常通知");
	}
	public void after(){
		System.out.println("—————finally—————");
	}
}
