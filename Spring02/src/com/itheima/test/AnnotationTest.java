package com.itheima.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.bean.Student;

//创建容器
@RunWith(SpringJUnit4ClassRunner.class) // 1.创建容器对象ApplicationContext ac
// 指定配置文件位置 = new ClassPathXmlApplicationContext("beans.xml");
@ContextConfiguration("classpath:beans.xml")

public class AnnotationTest {
	@Resource(name = "student") // 2.获取容器中的对象Student student = (Student)
	private Student student;// ac.getBean("student");

	@Test
	public void Test() {
		// 输出结果
		System.out.println("无参 ---" + student);
	}

}
