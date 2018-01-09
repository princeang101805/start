package com.wza.maven.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wza.maven.dao.IAcountDao;
import com.wza.maven.service.IAcountService;

@Service
public class AcountServiceImpl implements IAcountService {
	@Autowired
	private IAcountDao iAcountDao;
	@Transactional
	@Override
	public void transfer(Integer from, Integer to, Double money) {
		iAcountDao.addMoney(to, money);
		//Integer.parseInt("adfd");
		iAcountDao.reduceMoney(from, money);
	}
}
