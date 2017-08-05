package com.itheima.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.service.AccountService;

//创建容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans2.xml")
public class AccountTest {
	@Resource(name = "accountService")
	private AccountService as;

	@Test
	public void tTest() {
		as.transfre(1, 2, 200D);
	}

}