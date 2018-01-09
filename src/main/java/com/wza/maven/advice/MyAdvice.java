package com.wza.maven.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	public void before(){
		System.out.println("+++++++ǰ�÷���+++++++");
	}
	public void afterReturning(){
		System.out.println("=====���÷���=====");
	}
	public Object around(ProceedingJoinPoint point) throws Throwable{
		System.out.println("����֪֮ͨǰ");
		Object object = point.proceed();
		System.out.println("����֪֮ͨ��");
		return object;
	} 
	public void afterException(){
		System.out.println("�����쳣֪ͨ");
	}
	public void after(){
		System.out.println("����������finally����������");
	}
}
