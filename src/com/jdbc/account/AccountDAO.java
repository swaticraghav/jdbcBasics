package com.jdbc.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {

	public static void main(String[] args) {
		
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
			
			// create the sql
			String sql = "select * from account";
			
			// create the statement
			Statement myStmt = connection.createStatement();
			
			// execute the statement and assign the value to result set
			ResultSet MyRs = myStmt.executeQuery(sql);
			
			// loop over result set
			while(MyRs.next()) {
				System.out.println(MyRs.getString(2));
				System.out.println(MyRs.getString(3));
				System.out.println(MyRs.getString(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
