package com.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Productinsert")

public class Productinsert extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//assign entered values to variables
		String productname = request.getParameter("pname");
		String description = request.getParameter("des");
		String image = request.getParameter("img");
		String price = request.getParameter("pri");
		
		boolean isTrue;
				
		isTrue = ProductDBUtil.insertproduct(productname, description, image, price);
		//call Product insert method and get boolean return value
		
		if(isTrue == true) {//if data insertion is successful
			
			RequestDispatcher dis = request.getRequestDispatcher("adminhome.jsp");
			
			dis.forward(request, response);//redirect to the adminhome.jsp
			
		}else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");//redirect to the unsuccess.jsp
			
			dis2.forward(request,response);
			
		}
	}

}
