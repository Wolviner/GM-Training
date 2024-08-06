package com.grayMatter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSource {
	
	private String driverName;
	private String url;
	private String unam;
	private String pwd;
	
	public DataSource() {
		super();
	}

	public DataSource(String driverName, String url, String unam, String pwd) {
		super();
		this.driverName = driverName;
		this.url = url;
		this.unam = unam;
		this.pwd = pwd;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUnam() {
		return unam;
	}

	public void setUnam(String unam) {
		this.unam = unam;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "DataSource [driverName=" + driverName + ", url=" + url + ", unam=" + unam + ", pwd=" + pwd + "]";
	}
	
	
	public Connection getConnection() {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection(url,unam,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
