package com.itheima.dao;

import java.util.List;

import com.itheima.domain.User;

public interface UserDao {
	void save(User user);

	void del(User user);

	void update(User user);

	public User findById(Integer id);

	int findPage();

	List<User> findAll();
}
