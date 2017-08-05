package com.itheima.bean;

public class Student {

	private String name;
	private String addr;
	private Integer age;
	private Address address;

	public Student() {
		System.out.println("无参构造方法创建对象!!!");
	}

	public Student(String name, String addr, Integer age, Address address) {
		System.out.println("有参构造方法创建对象!!!");
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", age=" + age + ", address=" + address + "]";
	}

}
