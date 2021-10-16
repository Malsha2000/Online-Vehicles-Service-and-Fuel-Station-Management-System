package com.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnect {

	
	//create database connection
	
	private static String url = "jdbc:mysql://localhost:3306/vehicle?autoReconnect=true&useSSL=false";//database URL
	
	private static String userName = "root";//database username
	
	private static String password = "Mal@1234";//database password
	
	private static Connection con;//create connection object
	
	public static Connection getConnection() {
		
		
		//validate
		
		try {
			  Class.forName("com.mysql.jdbc.Driver");//database driver
			  
			  //calling database
			  
			   con= DriverManager.getConnection(url,userName,password);//connect to the database
			   
		}
		
		catch(Exception e) {//sql exception
			
			System.out.println("Database connection is not success!!!");
		}
		
		
		return con;//return the connection
		
	}
}

