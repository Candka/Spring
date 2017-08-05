package com.itheima.test;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcTemplateDemo {
	@Test
	public void jtTest() throws Exception {

		// 准备连接池
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql:///hibernate");
		dataSource.setUser("root");
		dataSource.setPassword("root");

		// 创建JDBC对象模板
		JdbcTemplate jt = new JdbcTemplate(dataSource);
		String sql = "insert into t_user values(null,'tom')";
		jt.update(sql);
	}
}
