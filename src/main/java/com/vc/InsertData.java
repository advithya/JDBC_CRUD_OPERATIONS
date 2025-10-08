package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dboct25","root","1234");
	
			PreparedStatement st = con.prepareStatement("insert into student values(?, ?, ?)");
			
			st.setInt(1, 101);
			st.setString(2, "james");
			st.setString(3, "java");
			
			st.setInt(1, 102);
			st.setString(2, "charl");
			st.setString(3, "java");
			int noOfRows = st.executeUpdate();
			
			System.out.println("no of rows inserted "+noOfRows);			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
