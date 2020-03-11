package com.soft.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static Connection con;
	
	static {
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","durga");
		System.out.println("Connection Created Successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getConnection() {
		return con;
	}
	 
	public static void cleanUp() {
		try {
			con.close();
			System.out.println("*********Connection Object destroyed Succesfully***********");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
