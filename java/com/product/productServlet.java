package com.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/productServlet")

public class productServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	String productID = request.getParameter("pid");//assign user entered values to variables
	
	try {
		
		List<Product> proDetails = ProductDBUtil.validate(productID);//call validate
		
		request.setAttribute("proDetails", proDetails);
		
	}
	
	catch(Exception e) {//if any exception occurs, print the exception in the console
		
		e.printStackTrace();
		
	}
	
	//product servlet assign directly to the user account
	
	RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");//send data to user account
	
	dis.forward(request, response);
	
	}

}
