package com.itheima.service.impl;

import java.util.List;

import com.itheima.bean.Student;
import com.itheima.service.StudentSservice;

public class StudentServiceImpl implements StudentSservice {

	@Override
	public void save(Student student) {
		System.out.println("save");
	}

	@Override
	public void del(Student student) {
		System.out.println("del");

	}

	@Override
	public void update(Student student) {
		System.out.println("update");

	}

	@Override
	public Student findById(Integer id) {
		System.out.println("findById");
		return null;
	}

	@Override
	public int findPage() {
		System.out.println("findPage");
		return 0;
	}

	@Override
	public List<Student> findAll() {
		System.out.println("findAll");
		return null;
	}

}
