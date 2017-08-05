package com.itheima.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component("student")
//@Service("student") // service层
//@Controller("student") // web层
//@Repository("student")// dao层
@Component("student") // <bean id="student" class="com.itheima.bean.student"
// @Scope(scopeName = "prototype") // scope="prototype" >//指定对象的作用范围
public class Student {
	@Value("tom")
	private String name;// <property name="name" value="tom" />
	//@Autowired // 自动装配
	//@Qualifier("addr1") // 指定装配哪个对象
	@Resource(name = "address") // 手动注入对象（推荐使用）
	private Address addr;// <property name="addr" ref="address" />
	@Value("18")
	private Integer age;// <property name="age" value="18" />

	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}

	@PostConstruct // 对象构造后调用（初始化方法）
	public void init() {
		System.out.println("<bean init-method='init' />");
	}

	@PreDestroy // 销毁方法
	public void destroy() {
		System.out.println("destroy-method='destroy'//>");
	}
}
