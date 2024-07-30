package com.grayMatter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDriver {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/graymatterdb";
        String username = "root";
        String password = "Password";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }
}



