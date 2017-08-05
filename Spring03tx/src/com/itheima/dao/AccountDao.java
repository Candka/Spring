package com.itheima.dao;

public interface AccountDao {
	void addMoney(Integer id , Double money);
	
	void decMoney(Integer id , Double money);

}
