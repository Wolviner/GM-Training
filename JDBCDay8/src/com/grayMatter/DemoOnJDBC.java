package com.grayMatter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoOnJDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		String url="jdbc:mysql://localhost:3306/graymatterdb";
		String username="root";
		String password="Password";
		
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established");
		
//		DML QUERIES
//		Statement st=con.createStatement();//to execute query
//		String query="Select first_name,employee_id from employees";
//		ResultSet rs=st.executeQuery(query);//temp buffer to store mutiple record from sql
//		
//		while(rs.next()) {
//			System.out.println(rs.getString(1)+" "+rs.getInt(2));
//			
//		}
//		rs.close();
//		st.close();
//		con.close();
		
//		PREPARED STATEMENT
		String query="insert into regions values(?,?)";
		PreparedStatement ps=con.prepareStatement(query);//prprd stmnts are precompiled stmnts
		ps.setInt(1,8);
		ps.setString(2, "North Korea");
		int row=ps.executeUpdate();
		System.out.println("Row inserted "+row);
		
		ps.close();
//		rs.close();
//		st.close();
		Statement st=con.createStatement();//to execute query
		String query1="Select * from regions";
		ResultSet rs=st.executeQuery(query1);//temp buffer to store mutiple record from sql
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
		ResultSetMetaData rsmd=rs.getMetaData();
		System.out.println("METADATA:  "+rsmd);
		
		System.out.println(rs);
		
		
		con.close();
	}

}

//prepared statement ----DML [insert,delete,update]
//callable statement ------