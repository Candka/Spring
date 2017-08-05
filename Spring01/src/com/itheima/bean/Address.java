package com.itheima.bean;

public class Address {
	private String sheng;
	private String shi;
	private String qu;

	public Address() {
		System.out.println("无参构造方法创建对象!!!");
	}

	public Address(String sheng, String shi, String qu) {
		System.out.println("有参构造方法创建对象!!!");
		this.sheng = sheng;
		this.shi = shi;
		this.qu = qu;
	}

	public String getSheng() {
		return sheng;
	}

	public void setSheng(String sheng) {
		this.sheng = sheng;
	}

	public String getShi() {
		return shi;
	}

	public void setShi(String shi) {
		this.shi = shi;
	}

	public String getQu() {
		return qu;
	}

	public void setQu(String qu) {
		this.qu = qu;
	}

	@Override
	public String toString() {
		return "Address [sheng=" + sheng + ", shi=" + shi + ", qu=" + qu + "]";
	}

}
