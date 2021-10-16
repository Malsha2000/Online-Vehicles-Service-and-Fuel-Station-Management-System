package com.product;

import java.util.Objects;

public class Product { 
	
	private int productID;
	private String productname;
	private String description;
	private String image;
	private String price;
	
//Generate constructors
	
	public Product(int productID, String productname, String description, String image, String price) {
	
		this.productID = productID;
		this.productname = productname;
		this.description = description;
		this.image = image;
		this.price = price;
		
	}
	
	
	public int getProductID() {//productID output
		return productID;
		
	}
 

	public void setProductID(int productID) {
		this.productID = productID;
		
	}


	public String getProductname() {//productname output
		return productname;
		
	}


	public void setProductname(String productname) {
		this.productname = productname;
		
	}


	public String getDescription() {//description output
		return description;
		
	}


	public void setDescription(String description) {
		this.description = description;
		
	}


	public String getImage() {//image output
		return image;
		
	}


	public void setImage(String image) {
		this.image = image;
		
	}


	public String getPrice() {//price output
		return price;
		
	}


	public void setPrice(String price) {
		this.price = price;
		
	}

//p
//overriding the toString method
	
	
	@Override
	public String toString() {
		
		return "Product [productID=" + productID + ", productname=" + productname + ", description=" + description
				+ ", image=" + image + ", price=" + price + ", getProductID()=" + getProductID() + ", getProductname()="
				+ getProductname() + ", getDescription()=" + getDescription() + ", getImage()=" + getImage()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]"; 
		
	}
	
}
