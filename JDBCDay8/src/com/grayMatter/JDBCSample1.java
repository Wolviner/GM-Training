package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSample1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		String url="jdbc:mysql://localhost:3306/graymatterdb";
		String username="root";
		String password="Password";
		
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection Established");
		
		
		String upd_query="update regions set region_name=? where region_id=?";
		PreparedStatement psu=con.prepareStatement(upd_query);
		psu.setString(1, "Thambanam");
		psu.setInt(2, 6);
		psu.executeUpdate();
		System.out.println("Rows updated");
		
		String del_query="delete from regions where region_id=?";
//		ps.getConnection().prepareStatement(query1);
		PreparedStatement psDelete = con.prepareStatement(del_query);
		psDelete.setInt(1, 4);
		int del_count=psDelete.executeUpdate();
		System.out.println(del_count+"Row deleted");
//		ps.close();
		
//		Statement st=con.createStatement();
//		String query2="Select * from regions";
//		
//		ResultSet rs=st.executeQuery(query2);	
		
		String selectQuery = "SELECT * FROM regions";
		
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(selectQuery);
				
		while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		
//		ps.close();
		
		rs.close();
		st.close();
		con.close();

	}

}
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JDBCSample1 {
//
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        System.out.println("Driver loaded");
//
//        String url = "jdbc:mysql://localhost:3306/graymatterdb";
//        String username = "root";
//        String password = "Password";
//
//        try (Connection con = DriverManager.getConnection(url, username, password)) {
//            System.out.println("Connection established");
//
//            // Update query
//            String updateQuery = "UPDATE regions SET region_name = ? WHERE region_id = ?";
//            try (PreparedStatement psUpdate = con.prepareStatement(updateQuery)) {
//                psUpdate.setString(1, "Thambanam");
//                psUpdate.setInt(2, 6);
//                int updateCount = psUpdate.executeUpdate();
//                System.out.println(updateCount + " row(s) updated");
//            }
//
//            // Delete query
//            String deleteQuery = "DELETE FROM regions WHERE region_id = ?";
//            try (PreparedStatement psDelete = con.prepareStatement(deleteQuery)) {
//                psDelete.setInt(1, 4);
//                int deleteCount = psDelete.executeUpdate();
//                System.out.println(deleteCount + " row(s) deleted");
//            }
//
//            // Select query
//            String selectQuery = "SELECT * FROM regions";
//            try (Statement st = con.createStatement();
//                 ResultSet rs = st.executeQuery(selectQuery)) {
//
//                while (rs.next()) {
//                    System.out.println(rs.getInt(1) + " " + rs.getString(2));
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
