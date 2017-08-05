package com.itheima.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address") 
public class Address {
	@Value("hubei")
	private String sheng;
	@Value("hubei")
	private String shi;
	@Value("hubei")
	private String qu;

	@Override
	public String toString() {
		return "Address [sheng=" + sheng + ", shi=" + shi + ", qu=" + qu + "]";
	}

}
