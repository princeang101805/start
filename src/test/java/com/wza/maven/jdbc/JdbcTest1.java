package com.wza.maven.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wza.maven.dao.IRoleDao;
import com.wza.maven.pojo.po.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jdbc.xml")
public class JdbcTest1 {
	@Autowired
	private IRoleDao iRoleDao;
	@Test
	public void test(){
		Role role = new Role(4,"guest","сн©м");
		iRoleDao.save(role);
	}
}
