package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class ProjectSQL {

		    public static void main(String[] args) throws ClassNotFoundException {
		        Scanner sc = new Scanner(System.in);

		        String url = "jdbc:mysql://localhost:3306/graymatterdb";
		        String username = "root";
		        String password = "Password";

		        try (Connection con = DriverManager.getConnection(url, username, password)) {
		            System.out.println("Connection Established");

		            while (true) {
		                System.out.println("\nSelect operation:");
		                System.out.println("1. Insert");
		                System.out.println("2. Update");
		                System.out.println("3. Delete");
		                System.out.println("4. Exit");
		                System.out.print("Enter your choice: ");
		                int choice = sc.nextInt();

		                switch (choice) {
		                    case 1:
		                        performInsert(con);
		                        break;
		                    case 2:
		                        performUpdate(con);
		                        break;
		                    case 3:
		                        performDelete(con);
		                        break;
		                    case 4:
		                        System.out.println("Exiting program.");
		                        return;
		                    default:
		                        System.out.println("Invalid choice.");
		                        break;
		                }
		            }

		        } catch (SQLException e) {
		            e.printStackTrace();
		        } finally {
		            sc.close();
		        }
		    }

		    private static void performInsert(Connection con) throws SQLException {
		        String query = "insert into regions values(?, ?)";
		        try (PreparedStatement ps = con.prepareStatement(query)) {
		            Scanner scanner = new Scanner(System.in);
		            System.out.print("Enter region_id: ");
		            int regionId = scanner.nextInt();
		            scanner.nextLine(); 
		            System.out.print("Enter region_name: ");
		            String regionName = scanner.nextLine();

		            ps.setInt(1, regionId);
		            ps.setString(2, regionName);

		            int rowsInserted = ps.executeUpdate();
		            System.out.println(rowsInserted + " row(s) inserted.");
		        }
		    }

		    private static void performUpdate(Connection con) throws SQLException {
		        String query = "update regions set region_name = ? where region_id = ?";
		        try (PreparedStatement ps = con.prepareStatement(query)) {
		            Scanner scanner = new Scanner(System.in);
		            System.out.print("Enter region_id to update: ");
		            int regionId = scanner.nextInt();
		            scanner.nextLine(); // Consume newline left-over
		            System.out.print("Enter new region_name: ");
		            String regionName = scanner.nextLine();

		            ps.setString(1, regionName);
		            ps.setInt(2, regionId);

		            int rowsUpdated = ps.executeUpdate();
		            System.out.println(rowsUpdated + " row(s) updated.");
		        }
		    }

		    private static void performDelete(Connection con) throws SQLException {
		        String query = "delete from regions where region_id = ?";
		        try (PreparedStatement ps = con.prepareStatement(query)) {
		            Scanner scanner = new Scanner(System.in);
		            System.out.print("Enter region_id to delete: ");
		            int regionId = scanner.nextInt();

		            ps.setInt(1, regionId);

		            int rowsDeleted = ps.executeUpdate();
		            System.out.println(rowsDeleted + " row(s) deleted.");
		        }
		    }
		


	}


