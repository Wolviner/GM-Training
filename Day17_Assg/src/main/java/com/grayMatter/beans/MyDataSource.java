package com.grayMatter.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyDataSource {


//@Value("com.mysql.cj.jdbc.Driver")
private String driver;
private String url;
private String uname;
private String pwd;

@PostConstruct
public void setup() {
	driver="com.mysql.cj.jdbc.Driver";
	url="jdbc:mysql://localhost:3306/graymatterdb";
	uname="root";
	pwd="Password";
	System.out.println("Setup Done");
	
}

public Connection getConnection() throws ClassNotFoundException, SQLException {
	Class.forName(driver);
	Connection con=DriverManager.getConnection(url,uname,pwd);
	return con;
}

//@PostConstruct
//public void init() {
//	System.out.println("Init Method");
//}
@PreDestroy
public void destroy() {
	System.out.println("Destroy Method");
}
}
