package com.itheima.injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.bean.Address;
import com.itheima.bean.Student;

public class InjectionTest {

	@Test
	public void Test() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/itheima/injection/beans.xml");
		// 获取容器中的对象
		Address address = (Address) ac.getBean("address");
		// 输出结果
		System.out.println("常量注入" + "---" + address);
	}

	@Test
	public void Test1() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/itheima/injection/beans.xml");
		// 获取容器中的对象
		Student student1 = (Student) ac.getBean("student1");
		// 输出结果
		System.out.println("bean注入" + "---" + student1);
	}

	@Test
	public void Test3() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/itheima/injection/beans.xml");
		// 获取容器中的对象
		CollectionBean collectionBean = (CollectionBean) ac.getBean("collectionBean");
		// 输出结果
		System.out.println("复杂注入方式" + "---" + collectionBean);
	}

	@Test
	public void Test9() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/itheima/injection/beans.xml");
		// 获取容器中的对象
		Student student9 = (Student) ac.getBean("student9");
		// 输出结果
		System.out.println("P命名空间注入" + "---" + student9);
	}

	@Test
	public void Test10() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/itheima/injection/beans.xml");
		// 获取容器中的对象
		Address address10 = (Address) ac.getBean("address10");
		// 输出结果
		System.out.println("c命名空间注入" + "---" + address10);
	}

	@Test
	public void Test11() {
		// 1.创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("/com/itheima/injection/beans.xml");
		// 获取容器中的对象
		Student student11 = (Student) ac.getBean("student11");
		// 输出结果
		System.out.println("spel注入" + "---" + student11);
	}

}
