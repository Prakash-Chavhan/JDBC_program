package com.yash;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;



import java.sql.*;

public class PreparedStatement_ex{
public static void main(String[] args) {
	try {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		Connection conn=Connection_master.getConnection();
		PreparedStatement st=conn.prepareStatement("select * from student where id =?");
		System.out.println("Please Enter Id");
		st.setInt(1,Integer.parseInt(sc.nextLine()));
		ResultSet rs=st.executeQuery();
		List<Student> l1=st.execute("select * from student",new RowMapper<Student>(){
		public	Student mapRow(ResultSet es, int rowNum) throws SQLException {
			      
			      s.setId(es.getInt("id"));
			      s.setName(es.getString("name"));
			  //    s.setAge(es.getInt("age"));
			      return s;
			   }
		});
		if(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("sname")+" "+rs.getInt("totalmarks"));
		}else {
			System.out.println("Record not found");
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}
