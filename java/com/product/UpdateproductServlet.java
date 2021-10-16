package com.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateproductServlet")

public class UpdateproductServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	   //assign entered values to variables
	
		String productID = request.getParameter("id");
		
		String productname = request.getParameter("pname");
		
		String description = request.getParameter("des");
		
		String image  = request.getParameter("img");
		
		String price = request.getParameter("pri");
		
		boolean isTrue;
		
		isTrue = ProductDBUtil.updateproducts(productID, productname, description, image, price);
		//call payment update method and get boolean return value
		
		if(isTrue == true) {//if data insertion is successful
			
			List<Product> proDetails = ProductDBUtil.getproDetails(productID); //call getproDetails method
			
			request.setAttribute("proDetails", proDetails);//create attribute using proDetails arrayList
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");//redirect to the useraccount.jsp
			
			dis.forward(request,response);
			
		}
		
		else {
			
			List<Product> proDetails = ProductDBUtil.getproDetails(productID);
			
			request.setAttribute("proDetails", proDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
			
			dis.forward(request, response);
			
		}
	}

}
