package com.yash;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_query {
public static void main(String[] args) {
	try {
	Connection conn=Connection_master.getConnection();
	Statement s=conn.createStatement();
	ResultSet rs=s.executeQuery("select * from student where id=1");
	while(rs.next()) {
		System.out.println(rs.getInt("id")+" "+rs.getString("sname")+" "+rs.getInt("totalmarks"));
	}
	conn.close();
}catch(SQLException e) {
	System.out.println("Prakash Chavhan");
	System.out.println(e.getMessage());
}
}
}
