package com.torryharris.TransactionDemo.driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;

import com.torryharris.TransactionDemo.model.Employee;
import com.torryharris.TransactionDemo.model.Insurance;

public class TransactionDemo {
	
	static Connection con;

	static Savepoint savePoint1;
	static Savepoint savePoint2;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/company";
		String userName ="root";
		String password="root";
		
		 con = DriverManager.getConnection(url, userName, password);
		
		//insertEmployees(con);
		
	//	insertInsuranceDetails(con);
		
		con.setAutoCommit(false);// Set auto-commit to false.
		
		Statement stat = con.createStatement();
		
		// 1001-2001-400000
		// 1002 - 2002-3000000
		// 1003-2003-200000
		System.out.println("Transaction started...\n");
		
		String insertQuery = "insert into employee_insurance values(1001,2001)";
		String updateQuery = "update employee set sum_assured=400000 where emp_id=1001";
		System.out.println(insertQuery);
		System.out.println(updateQuery);
		System.out.println();
		stat.execute(insertQuery);
		stat.executeUpdate(updateQuery);
		 savePoint1 = con.setSavepoint("Save Point1");		// savepoint 1
		
		 insertQuery = "insert into employee_insurance values(1002,2002)";
		 updateQuery = "update employee set sum_assured=3000000 where emp_id=1002";
		 System.out.println(insertQuery);
			System.out.println(updateQuery);
			System.out.println();
		stat.execute(insertQuery);
		stat.executeUpdate(updateQuery);
		savePoint2 = con.setSavepoint("Save Point2"); // savepoint 2
		
		 insertQuery = "insert into employee_insurance values(1003,2003)";
		 updateQuery = "update employee  sum_assured=200000 where emp_id=1003";
		 System.out.println(insertQuery);
			System.out.println(updateQuery);
			System.out.println();
		stat.execute(insertQuery);
		stat.executeUpdate(updateQuery);
		
		con.commit();
		
		System.out.println("\n-- Transaction Success---\n");
		stat.close();
		con.close();
		}
		catch(SQLException ex) {
			
			System.out.println("Exception occurred...!! Rolling back the transaction to SavePoint2");
			ex.printStackTrace();
				// Change The save points to different values to observe the changes in DB
			// If you rollback without savepoint, none of the changes will be updated in DB
			con.rollback(savePoint2);
			con.commit();
			
		}

	} 

	private static void insertInsuranceDetails(Connection con) throws SQLException {
		
		Insurance lic = new Insurance(2001, "LIC", "Health");
		Insurance hdfc = new Insurance(2002, "HDFC", "Term");
		Insurance vidal = new Insurance(2003, "Vidal", "Accident");
		ArrayList<Insurance> insList= new ArrayList<Insurance>();
		insList.add(lic);
		insList.add(hdfc);
		insList.add(vidal);
		String pQuery = "insert into insurance values(?,?,?)";
		PreparedStatement pstat =con.prepareStatement(pQuery);
		
		for(Insurance ins:insList) {
			pstat.setInt(1, ins.getInsuranceId());
			pstat.setString(2, ins.getInsuranceName());
			pstat.setString(3, ins.getInsuranceType());
			System.out.println(pstat);
			pstat.execute();
			
		}
		
		System.out.println("Insurance records added to DB...\n");
		pstat.close();
	}

		
	

	private static void insertEmployees(Connection con) throws SQLException {
		
		Employee e1 = new Employee(1001, "Ram", "Manager", 50000);
		Employee e2 = new Employee(1002, "Shyam", "Tech Lead", 45000);
		Employee e3 = new Employee(1003, "Sita", "HR", 40000);
		Employee e4 = new Employee(1004, "Radha", "Architect", 60000);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		String pQuery = "insert into employee values(?,?,?,?,?)";
		PreparedStatement pstat =con.prepareStatement(pQuery);
		
		for(Employee e:empList) {
			pstat.setInt(1, e.getEmployeeId());
			pstat.setString(2, e.getName());
			pstat.setString(3, e.getDesignation());
			pstat.setInt(4, e.getSalary());
			pstat.setInt(5, e.getSumAssured());
			
			System.out.println(pstat);
			pstat.execute();
		}		
		System.out.println("Employee records inserted...\n");
		pstat.close();
	}
}
