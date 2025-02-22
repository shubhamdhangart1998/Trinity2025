package com.tnsif.dayfourteen.jdbcoperationsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			
			//step 4: Result set
			
			ResultSet rs=stmt.executeQuery("select * from student where stdid=101");
			System.out.println("Stdid\t name\t subject\t duration ");
			
			while (rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+ rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getDouble(4));
			}
			
		
		
		
		
		
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
	}
	}


