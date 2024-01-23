package com.jsp.stringprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveStudent {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001" , "root" , "root") ;
		
		Statement st =con.createStatement();
		String sql ="INSERT INTO STUDENT VALUES(2, 'RAJU','MALE')";
		st.execute(sql);
		con.close();
		System.out.println("data insert successfuly");
	

	}

}
