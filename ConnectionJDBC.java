package com.raj.connection;

import java.sql.*;

public class ConnectionJDBC {
	
	private static final ConnectionJDBC INSTANCE = new ConnectionJDBC();
	
	private ConnectionJDBC() {
	}
	
	public static ConnectionJDBC getInstance() {
		return INSTANCE;
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails", "root", "root");
		return con;
	}

}

/*
 * 
 * public static void main(String[] args){ // TODO Auto-generated method stub
 * 
 * try { Class.forName("com.mysql.jdbc.Driver"); Connection
 * con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdetails",
 * "root","root");
 * 
 * Statement stmt=con.createStatement(); ResultSet
 * re=stmt.executeQuery("select * from student");
 * 
 * }catch(Exception e) { System.out.println(e); } }
 * 
 * }
 * 
 */