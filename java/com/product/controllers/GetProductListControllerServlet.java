package com.product.controllers;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.Product;
import com.product.ProductDBUtil;
import com.product.interfaces.IProductService;


@WebServlet("/GetProductListControllerServlet")

public class GetProductListControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   
    public GetProductListControllerServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			IProductService iProductService =  new ProductDBUtil();//create object IProductService.java
			
			List<Product> products = iProductService.getProductList();//create list
			
			request.setAttribute("product_list", products);
			
			if(products != null) {
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("productview.jsp");//redirect to the productview.jsp
				
				dispatcher.forward(request, response);
			}
			
			else {
					
			}
			
		}
		catch(Exception ex) {//if any exception occurs, print the exception in the console
			
			ex.getMessage();
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
