package com.tnsif.dayfourteen.jdbcoperationsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCPreparedSTMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		
		{
			
			Scanner sc=new Scanner(System.in);
	
			//step1: load or registered the driver 
			
			Class.forName("com.mysql.jdbc.Driver");		
		
			System.out.println("Driver is load successfully");
			
			//step 2: create connection 
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kjtrinty", "root", "root");
			System.out.println("Connection created successfully");
			
			//step 3: create a statement 
			
			Statement stmt=con.createStatement();
			System.out.println("Statement created successfully");
			
			
			PreparedStatement psmt=con.prepareStatement("insert into student values(?,?,?,?)");
			
			
		//	Scanner class
			psmt.setInt(1, 1001);
			psmt.setString(2, "Aditya");
			psmt.setString(3, "Java");
			psmt.setDouble(4, 34.56);
			psmt.addBatch();
			
			psmt.setInt(1, 1002);
			psmt.setString(2, "Amruta");
			psmt.setString(3, "JavaS");
			psmt.setDouble(4, 34.56);
			psmt.addBatch();
			
			psmt.setInt(1, 1003);
			psmt.setString(2, "Zeel");
			psmt.setString(3, "Java");
			psmt.setDouble(4, 34.56);
			psmt.addBatch();
			
			psmt.setInt(1, 1004);
			psmt.setString(2, "Abhi");
			psmt.setString(3, "JavaSql");
			psmt.setDouble(4, 34.56);
			psmt.addBatch();
			
			int [] a=stmt.executeBatch();
			a=psmt.executeBatch();
		
			psmt.close();
			con.close();
			
		
		
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}

}
