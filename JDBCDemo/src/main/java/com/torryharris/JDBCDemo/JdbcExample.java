package com.torryharris.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1st Step, Load the JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2nd Step, Connect to DB
		String url="jdbc:mysql://localhost:3306/e_commerce";
		String userName="root";
		String password="root";
		
		Connection con= DriverManager.getConnection(url, userName, password);
		System.out.println("Connection is established...");
		// 3rd Step, Create a Statement Object to execute the Queries
		Statement stat = con.createStatement();
		
		// 4. Executing Queries
		//Update Query
		String updateQuery="update customer set name='Saaketh' where customer_no=1001";
		int rows=stat.executeUpdate(updateQuery);
		System.out.println(updateQuery);
		System.out.println("Query Executed !!");
	
		// Insert Query
		String insertQuery = "insert into customer values(1008,'Harry','harry@gmail.com')";
		stat.execute(insertQuery);
		System.out.println(insertQuery);
		
		// Select Query
		String query = "select * from customer";
		ResultSet rs = stat.executeQuery(query);
		System.out.println("\n---Customer Details are as follows---\n");
		System.out.println("Number\tName\temail");
		System.out.println("-----------------------");
		while(rs.next()) {
			int customerNo = rs.getInt("customer_no");
			String name = rs.getString("name");
			String email = rs.getString("email");
			System.out.println(customerNo+"\t"+name+"\t"+email);
			
		}
		
		
		// 5. Close the connections
		stat.close();
		con.close();
		

	}

}
