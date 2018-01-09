package com.wza.maven.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wza.maven.dao.IAcountDao;

@Repository
public class AcountDaoImpl implements IAcountDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void addMoney(Integer id, Double money) {
		String sql="update ar_account set money = money + ? where id = ? ";
		jdbcTemplate.update(sql, money,id);
	}
	@Override
	public void reduceMoney(Integer id, Double money) {
		String sql="update ar_account set money = money - ? where id = ? ";
		jdbcTemplate.update(sql, money,id);
	}
}
