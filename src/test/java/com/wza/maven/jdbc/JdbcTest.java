package com.wza.maven.jdbc;

import java.beans.PropertyVetoException;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcTest {
	@Test
	public void test() throws PropertyVetoException{
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/day07");
		dataSource.setUser("root");
		dataSource.setPassword("123");
	     
	    JdbcTemplate template = new JdbcTemplate(dataSource);
	    template.update("insert into role values(?,?,?)",3,"monster","π÷ŒÔ");
	}
}
