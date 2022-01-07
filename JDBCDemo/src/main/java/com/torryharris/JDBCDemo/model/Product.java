package com.torryharris.JDBCDemo.model;

public class Product {
	
	private int productNo;
	private String productName;
	private int price;
	
	public Product(int productNo, String productName, int price) {
		this.productNo = productNo;
		this.productName = productName;
		this.price = price;
	}

	public int getProductNo() {
		return productNo;
	}

	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", price=" + price + "]";
	}	
}
