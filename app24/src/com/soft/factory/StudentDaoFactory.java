package com.soft.factory;

import com.soft.dao.StudentDao;
import com.soft.dao.StudentDaoImpl;

public class StudentDaoFactory {
	
	private static StudentDao studentDao;
	
	static
	{
		studentDao = new StudentDaoImpl();
	}
	
	public static StudentDao getStudentDao() {
		return studentDao;
	}

}
