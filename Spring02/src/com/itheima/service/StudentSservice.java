package com.itheima.service;

import java.util.List;

import com.itheima.bean.Student;

public interface StudentSservice {

	void save(Student student);

	void del(Student student);

	void update(Student student);

	public Student findById(Integer id);

	int findPage();

	List<Student> findAll();

}
