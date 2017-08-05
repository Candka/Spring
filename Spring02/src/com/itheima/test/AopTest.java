package com.itheima.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.service.StudentSservice;

//创建容器
@RunWith(SpringJUnit4ClassRunner.class) // 1.创建容器对象ApplicationContext ac
// 指定配置文件位置 = new ClassPathXmlApplicationContext("beans.xml");
//@ContextConfiguration("classpath:com/itheima/aspact/beans.xml")
@ContextConfiguration("classpath:com/itheima/aspact/beansanno.xml")

public class AopTest {
	@Resource(name = "studentSservice") // 2.获取容器中的对象Student student = (Student)
	private StudentSservice ss;// ac.getBean("student");

	@Test
	public void Test() {
		ss.findAll();
	}

}
