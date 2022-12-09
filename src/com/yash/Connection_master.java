package com.yash;
import java.sql.*;

public class Connection_master {
	static String URL="jdbc:mysql://localhost:3306/Jdbce_Master";
    static String USERNAME="root";
    static String PASSWORD="root";
	public static Connection getConnection() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		return conn;
	}catch(Exception e) {
		
	}
		return null;
}
}