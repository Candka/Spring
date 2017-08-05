package com.itheima.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

//创建容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class UserTest {
	@Resource(name = "userDao")
	private UserDao ud;

	@Test
	public void saveTest() {
		User user = new User();
		user.setName("luxi");
		ud.save(user);
	}

	@Test
	public void delTest() {
		User user = new User();
		user.setId(1);
		ud.del(user);
	}

	@Test
	public void updateTest() {
		User user = new User();
		user.setId(3);
		user.setName("zhangshan");
		ud.update(user);
	}

	@Test
	public void findByIdTest() {
		Integer id = 3;
		User user = ud.findById(id);
		System.out.println(user);
	}

	@Test
	public void findPageTest() {
		int page = ud.findPage();
		System.out.println(page);
	}

	@Test
	public void findAllTest() {
		List<User> list = ud.findAll();
		System.out.println(list);
	}

}