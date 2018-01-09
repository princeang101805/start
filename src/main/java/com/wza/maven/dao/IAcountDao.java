package com.wza.maven.dao;

public interface IAcountDao {
	void addMoney(Integer id,Double money);
	void reduceMoney(Integer id,Double money);
}
