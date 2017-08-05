package com.itheima.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void addMoney(Integer id, Double money) {

		String sql = "update t_account set money = money+? where id=?";
		getJdbcTemplate().update(sql, money, id);
	}

	@Override
	public void decMoney(Integer id, Double money) {
		String sql = "update t_account set money = money-? where id=?";
		getJdbcTemplate().update(sql, money, id);
	}

}
