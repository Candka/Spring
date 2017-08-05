package com.itheima.bean;

public class StudentFactory {

	public static Student newInstance() {
		System.out.println("静态工厂创建对象");
		return new Student();
	}

	public Student newDynamicInstance() {
		System.out.println("动态态工厂创建对象");
		return new Student();
	}
}