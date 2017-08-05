package com.itheima.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.dao.AccountDao;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	//<tx:method name="transfre" isolation="REPEATABLE_READ" propagation="REQUIRED" read-only="false" />
	public void transfre(Integer from, Integer to, Double money) {
		accountDao.decMoney(from, money);
		// int i = 1 / 0;
		accountDao.addMoney(to, money);

	}

}
