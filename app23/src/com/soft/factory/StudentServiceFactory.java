package com.soft.factory;

import com.soft.service.StudentService;
import com.soft.service.StudentServiceImpl;

public class StudentServiceFactory {
	
	private static StudentService stdService;
	
	static {
		stdService = new StudentServiceImpl();
	}
	
	public static StudentService getStudentService() {
		return stdService;
	}

}
