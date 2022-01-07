package com.torryharris.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.torryharris.JDBCDemo.model.Product;

public class ProductDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Product hpLaptTop = new Product(2006, "HP Pavilion Laptop", 65000);
		Product acerLapTop = new Product(2007, "Acer Laptop", 62000);
		Product asusLapTop = new Product(2008, "Asus Laptop", 70000);
		
		Product iPhone11 = new Product(2009, "iPhone 11 Pro", 80000);
		Product iPad7 = new Product(2010, "iPad 7 Pro", 65000);
		Product appleWatch = new Product(2011,"Apple Watch",40000);
		
		ArrayList<Product> productList = new ArrayList<Product>();
		
		productList.add(hpLaptTop);
		productList.add(acerLapTop);
		productList.add(asusLapTop);
		productList.add(iPhone11);
		productList.add(iPad7);
		productList.add(appleWatch);
		
		Class.forName("com.mysql.cj.jdbc.Driver");	
		String url = "jdbc:mysql://localhost:3306/e_commerce";
		String userName = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		Statement stat = con.createStatement();
		
		// Insert the products in to the DB
		insertProductsIntoDB(stat,productList);
		
		// Display the products from DB
		ArrayList<Product> dbProducts = new ArrayList<Product>();
		dbProducts= dbPdisplayProductsFromDB(stat);
		 System.out.println("Product Details...");
		 System.out.println("Prod_no\tName\tPrice");
		 System.out.println("------------------------");
		 for(Product p:dbProducts) {
			 System.out.println(p.getProductNo()+"\t"+p.getProductName()+"\t"+p.getPrice());
		 }			
	}

	private static ArrayList<Product> dbPdisplayProductsFromDB(Statement stat) throws SQLException {
		
		ArrayList<Product> dbProducts = new ArrayList<Product>();
		String query = "select * from product";
		ResultSet rs = stat.executeQuery(query);
		while(rs.next()) {
			dbProducts.add(new Product(rs.getInt("product_no"),rs.getString("product_name"),rs.getInt("price")));		
		}
		return dbProducts;
	}

	private static void insertProductsIntoDB(Statement stat,
			ArrayList<Product> productList) throws SQLException {
		
		for(Product p: productList) {
		String insertQuery = "insert into product values("
		+p.getProductNo()+",'"+p.getProductName()+"',"+
				p.getPrice()+")";
		System.out.println(insertQuery);
		stat.execute(insertQuery);
		}
		System.out.println("Products are Inserted in "
				+ "the DB...\n");
	}

}
