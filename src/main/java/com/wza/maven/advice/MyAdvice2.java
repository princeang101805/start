package com.wza.maven.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAdvice2 {
	@Pointcut("execution(* com.wza.maven.service.impl.*.*(..))")
	public void pc(){}
	@AfterReturning("MyAdvice2.pc()")
	public void afterReturning(){
		System.out.println("+++++++∫Û÷√∑Ω∑®+++++++");
	}
	
}
