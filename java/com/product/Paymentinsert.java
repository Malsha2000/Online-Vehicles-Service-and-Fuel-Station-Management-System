package com.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Paymentinsert")
public class Paymentinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//assign entered values to variables
		String name = request.getParameter("name");
		String number = request.getParameter("num");
		String date = request.getParameter("date");
		String cvv = request.getParameter("cvv");
		
		
		
		boolean isTrue;
		 
		isTrue = ProductDBUtil.insertpayment(name, number, date, cvv);
		//call payment insert method and get boolean return value
		
		if(isTrue == true) {//if data insertion is successful
			
		    RequestDispatcher dis = request.getRequestDispatcher("index.html");
		    
		dis.forward(request, response);//redirect to the index.html
		
		}else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");//redirect to the unsuccess.jsp
			
			dis2.forward(request, response);
			
		}
		
	}

}

