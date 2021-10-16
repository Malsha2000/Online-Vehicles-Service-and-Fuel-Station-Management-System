package com.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.product.interfaces.IProductService;

public class ProductDBUtil implements IProductService {
	
	public static boolean isSuccess;
	
	private static Connection con = null;//create connection 
	private static Statement stmt = null;//create statement 
	private static PreparedStatement preparedStatement = null;
	private static ResultSet rs = null;//create resultset object

	public static List<Product> validate(String productID) {
		
		ArrayList<Product> pro = new ArrayList<>();	//create an array  list assign values from product class

		
		try {
			

			con = DBConnect.getConnection();//get database connection using getConnection method
			
			stmt = con.createStatement();//create statement
			
			String sql = "select * from product where productID='"+productID+"'";//sql query to select all the data of relevant product
			
			rs = stmt.executeQuery(sql);//execute the query and assign value to resultset object
			
			if(rs.next()) {
				
				int productid = rs.getInt(1);//get product id
				
				String productname = rs.getString(2);//get product name
				
				String description = rs.getString(3);//get description
				
				String image = rs.getString(4);//get image
				
				String price = rs.getString(5);//get price
				
				Product c = new Product(productid,productname,description,image,price);
				
				pro.add(c);//create product object and assing values using constructor
			}
			
			
		}
		catch(Exception e) {//if any exception occurs, print the exception in the console
			
			e.printStackTrace();
		}
		
		return pro;//return product object
	}
	
	public static boolean insertproduct(String productname, String description, String image, String price) {
		
	boolean isSuccess = false;
	

	try {
		

		con = DBConnect.getConnection();//get database connection using getConnection method
		
		stmt = con.createStatement();//create statement
		
		String sql = "insert into product values (0,'"+productname+"', '"+description+"', '"+image+"', '"+price+"')";//create a sql query to insert product data to the database
		
		int rs = stmt.executeUpdate(sql);//execute and update Db, assign boolean value to resultset object
		
		if(rs > 0) {//if execution is success
			
			isSuccess = true;
			
		}else {//if execution is unsuccess
			
			isSuccess = false;
			
		}
	}
	catch(Exception e) {//if any exception occurs, print the exception in the console
		
		e.printStackTrace();
	}
	
	return isSuccess;//return the boolean value
	}
	
	public static boolean updateproducts(String productID, String productname, String description, String image, String price) {
		
		boolean isSuccess = false;	
		
		try {

			
			con = DBConnect.getConnection();//get database connection using getConnection method
			
			stmt = con.createStatement();//create statement

			
			String sql = "update product set productname ='"+productname+"', description='"+description+"', image= '"+image+"', price= '"+price+"'"
					+ "where productID= '"+productID+"'";
			//create sql query to update details
			
			int rs = stmt.executeUpdate(sql);//execute and update Db, assign boolean value to resultset object
			
			if(rs > 0) {
				
				isSuccess = true;//if execution is success
				
			}else {
				
				isSuccess = false;//if execution is unsuccess
			}
		}
		catch(Exception e) {//if any exception occurs, print the exception in the console
			
			e.printStackTrace();
		}
		return isSuccess;//return the boolean value
	}
	
	public static List<Product> getproDetails(String productID) {
		
		int convertedID = Integer.parseInt(productID);//convert String productID to integer
		
		ArrayList<Product> pro = new ArrayList<>();//create array list to assign values of product class
		
		try {
			
			
			con = DBConnect.getConnection();//get database connection using getConnection method
			
			stmt = con.createStatement();//create statement
			
			String sql = "select * from product where productID='"+convertedID+"'";//create a sql query to select all details of relevant product
			
			rs = stmt.executeQuery(sql);//execute the query and assign value to resultset object
			
			while(rs.next()) {//assign values to variables
				
				int productid = rs.getInt(1);//get id
				
				String productname = rs.getString(2);//get product name
				
				String description = rs.getString(3);//get description
				
				String image = rs.getString(4);//get image
				
				String price = rs.getString(5);//get price
				
				Product p = new Product(productid, productname, description, image, price);
				
				pro.add(p);//pass the product array list
			}
			
		}
		catch(Exception e) {//if any exception occurs, print the exception in the console
			
			e.printStackTrace();
		}
		return pro;//return product object
		}
	
	public static boolean deleteproduct(String productID) {
		
		int convertedID = Integer.parseInt(productID);//convert string value to integer value
		
		try {

			
			con = DBConnect.getConnection();//connect database
			
			stmt = con.createStatement();//create statement
			
			String sql = "delete from product where productID='"+convertedID+"'";//create sql query to delete a record of relevant product
			
			int r = stmt.executeUpdate(sql);//execute and update Db, assign boolean value to resultset object
			
			if(r > 0) {
				
				isSuccess = true;//if execution is success
				
			}
			
			else {
				
				isSuccess = false;//if execution is unsuccess
				
			}
		}
		catch(Exception e) {//if any exception occurs, print the exception in the console
			
			e.printStackTrace();
		}
		
		return isSuccess;//return the boolean value
	}
	
	//using polymorphism
	
	@Override 
	public List<Product> getProductList() {
		
		List<Product> productList = new ArrayList<>();//create an array  list
		
		try {

			
			con = DBConnect.getConnection();//connect database
			
			stmt = con.createStatement();//create statement
			
			String sql = "SELECT * FROM product";//create a sql query to select all products
			
			rs= stmt.executeQuery(sql);//execute the query and assign value to resultset object
			
			while(rs.next()) {//assign values to variables
				
				int productId =rs.getInt("productID");//get id
				
				String productname =rs.getString("productname");//get product name
				
				String description =rs.getString("description");//get description
				
				String image =rs.getString("image");//get image
				
				String price =rs.getString("price");//get price
		
				Product customerProduct = new Product(productId, productname, description,image, price);
				
				productList.add(customerProduct);//pass the product array list
				
				
			}	
			
			
		}catch(Exception ex) {//if any exception occurs, print the exception in the console
			
			ex.getMessage();
		}
		
		return productList;
	}
	
	
	public static boolean insertpayment(String name, String number, String date, String cvv) {
		
		boolean isSuccess = false;
		
		try {

			
			con = DBConnect.getConnection();//connect database
			
			stmt = con.createStatement();//create statement
			
			String sql = "insert into payment values (0, '"+name+"', '"+number+"', '"+date+"', '"+cvv+"')";//create a sql query to insert payment daetails to the database
			
		    int rs = stmt.executeUpdate(sql);//execute and update Db, assign boolean value to resultset object
		    
		     if(rs > 0) {
		    	 
		    	 isSuccess = true;//if execution is success
		    	 
		     }else {
		    	 
		    	 isSuccess = false;//if execution is unsuccess
		    	 
		     }
		     
		}
		
		 catch(Exception e) {//if any exception occurs, print the exception in the console
			 
			 e.printStackTrace();
			 
		 }
		
		return isSuccess;//return the boolean value
		
		}
	
}
