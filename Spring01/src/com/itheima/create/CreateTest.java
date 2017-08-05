package com.itheima.create;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.bean.Student;

public class CreateTest {

	@Test
	public void Test() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/itheima/create/beans.xml");
		// 获取容器中的对象
		Student student = (Student) ac.getBean("student");
		// 输出结果
		System.out.println("无参" + "---" + student);
	}

	@Test
	public void Test1() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/itheima/create/beans.xml");
		// 获取容器中的对象
		Student student1 = (Student) ac.getBean("student1");
		// 输出结果
		System.out.println("通过参数下标配置" + "---" + student1);
	}

	@Test
	public void Test2() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/itheima/create/beans.xml");
		// 获取容器中的对象
		Student student2 = (Student) ac.getBean("student2");
		// 输出结果
		System.out.println("通过参数名称配置" + "---" + student2);
	}

	@Test
	public void Test3() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/itheima/create/beans.xml");
		// 获取容器中的对象
		Student student3 = (Student) ac.getBean("student3");
		// 输出结果
		System.out.println("通过参数类型配置" + "---" + student3);
	}

	@Test
	public void Test4() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/itheima/create/beans.xml");
		// 获取容器中的对象
		Student student4 = (Student) ac.getBean("student4");
		// 输出结果
		System.out.println("静态工厂" + "---" + student4);
	}

	@Test
	public void Test5() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/itheima/create/beans.xml");
		// 获取容器中的对象
		Student student5 = (Student) ac.getBean("student5");
		// 输出结果
		System.out.println("动态工厂" + "---" + student5);
	}

}
