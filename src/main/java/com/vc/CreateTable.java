package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
			//step 1: load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 2: Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dboct25","root","1234");
			//step 3: prepare statement
			Statement st =con.createStatement();
			//step 4 : execute query
			st.executeUpdate("create table student(id int, name varchar(50),course varchar(50))" );
			//step 5: close connection
			st.close();
			con.close();
			System.out.println("table is created successfully!, check db");
			
			
					
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
