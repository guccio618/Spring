package com.jackie.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;

public class TestJdbc {

	public static void main(String[] args) {
		// "useSSL=false" means get rid of MySQL SSL warnings
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String userId = "hbstudent";
		String password = "hbstudent";
		
		try {
			System.out.println("Connecting to database: " + jdbcUrl);		
			Connection myConnection = DriverManager.getConnection(jdbcUrl, userId, password);
			System.out.println("Connection successful!!!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}