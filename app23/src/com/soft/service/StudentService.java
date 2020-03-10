package com.soft.service;

import java.util.List;

import com.soft.beans.Student;

public interface StudentService {
	
	public void addStudent(Student std);
	public List<Student> getAllStudents();

}
