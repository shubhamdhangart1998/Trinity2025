package com.tnsif.dayfourteen.jdbcoperationsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCTable {

	public static void main(String[] args) {
		

		try 
		{
	
			//step1: load or registered the driver 
			
			Class.forName("com.mysql.jdbc.Driver");		
		
			System.out.println("Driver is load successfully");
			
			//step 2: create connection 
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kjtrinty", "root", "root");
			System.out.println("Connection created successfully");
			
			//step 3: create a statement 
			
			Statement stmt=con.createStatement();
			System.out.println("Statement created successfully");
			
			
			//step 4: write a query
			
			String q="create table student (stdid int, name varchar(20), subject varchar(20), duration double)";
		
			boolean s=stmt.execute(q);
		
		
		
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		
		
	}

}
