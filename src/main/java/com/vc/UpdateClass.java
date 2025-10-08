package com.vc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateClass {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dboct25","root","1234");
			
			PreparedStatement st= con.prepareStatement("update student set course = ? where id = ?");
			st.setString(1,"Hibernate");
			st.setInt(2,102);
			
			int rowsUpdated = st.executeUpdate();
			System.out.println("no of rows updated : "+rowsUpdated);
			
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
