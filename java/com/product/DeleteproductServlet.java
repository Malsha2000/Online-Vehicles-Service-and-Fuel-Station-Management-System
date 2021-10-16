package com.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteproductServlet")

public class DeleteproductServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String productID = request.getParameter("id");//get user entered value
		
		boolean isTrue;
		
		isTrue = ProductDBUtil.deleteproduct(productID);//call deleteProduct method
		
		if (isTrue == true) {//if record deleted successfully
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("productinsert.jsp");//redirect to the productinsert.jsp
			
			dispatcher.forward(request, response);
			
		}
		
		else {//if record not deleted
			
			List<Product> proDetails = ProductDBUtil.getproDetails(productID);//call getproDetails method
			
			request.setAttribute("proDetails", proDetails);//create attribute using proDetails arrayList
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");//redirect to useraccount.jsp
			
			dispatcher.forward(request, response);
		}
		
		
		
	}

}
