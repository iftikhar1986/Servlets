package com.soft.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soft.beans.Student;
import com.soft.factory.ConnectionFactory;

public class StudentServiceImpl implements StudentService {
	
	
	
	public void addStudent(Student std) {
		
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			st.executeUpdate("insert into student values('"+std.getSid()+"','"+std.getSname()+"','"+std.getSaddr()+"')");
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		
	}
	
	public List<Student> getAllStudents(){
		
		List<Student> stdList = null;
		
		try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			
			stdList = new ArrayList<Student>();
			while (rs.next()) {
				Student std = new Student();
				std.setSid(rs.getString("SID"));
				std.setSname(rs.getString("SNAME"));
				std.setSaddr(rs.getString("SADDR"));
				stdList.add(std);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return stdList;
	}
}
