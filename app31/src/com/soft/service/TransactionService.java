package com.soft.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TransactionService {
	
	Connection con ;
	Statement st;
	
	public TransactionService() {
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","durga");
			st = con.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public int deposit(String accNo, int depAmt) {
		int totalAmt = 0;
		try {
			
			st.executeUpdate("update account set BALANCE= BALANCE+"+depAmt+"where ACCNO='"+accNo+"'");
			ResultSet rs = st.executeQuery("select * from account where ACCNO = '"+accNo+"'");
			rs.next();
			totalAmt  = rs.getInt("BALANCE");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totalAmt;
	}

}
