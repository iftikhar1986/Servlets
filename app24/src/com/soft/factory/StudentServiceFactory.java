package com.soft.factory;

import com.soft.service.StudentService;
import com.soft.service.StudentServiceImpl;

public class StudentServiceFactory {
	
	private static StudentService studentService;
	
	static 
	{
		studentService = new StudentServiceImpl();
	}
	
	public static StudentService getStudentService() {
		return studentService;
	}

}
