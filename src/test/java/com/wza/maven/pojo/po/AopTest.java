package com.wza.maven.pojo.po;

import javax.el.ELException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wza.maven.service.IService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-aop-test.xml")
public class AopTest {
	@Autowired
	private IService isService;
	@Test
	public void test1(){
		isService.save();
	}
}
