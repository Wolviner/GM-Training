package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class DBConnection {

	String url="jdbc:mysql://localhost:3306/graymatterdb";
	String uname="root";
	String password="Password";
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		DBConnection db=(DBConnection)(obj);
		return this.uname.equals(db.getUname())&&
				this.url.equals(db.getUrl())&&
				this.password.equals(db.getPassword());
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
		return Objects.hash(url,uname,password);
	}
	public  Connection getConnection() throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname
				,password);
		return con;
		
		
	}
}
