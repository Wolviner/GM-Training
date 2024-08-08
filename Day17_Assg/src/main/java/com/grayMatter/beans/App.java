package com.grayMatter.beans;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.grayMatter.config.ShopConfig;

public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new AnnotationConfigApplicationContext(ShopConfig.class);
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);

        MyDataSource dataSource = (MyDataSource) context.getBean("myDataSource");
        Connection con = null;
        try {
            con = dataSource.getConnection();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Connection Established");

        // dbutils bean
        DbUtils db = (DbUtils) context.getBean(DbUtils.class);
        db.setCon(con);

        // Example usage of getAll() method
        List<Regions> rList = db.getAll();
        for (Regions r : rList) {
            System.out.println(r.getRname() + " " + r.getRid());
        }

        Regions reg;
        reg = db.addregion(new Regions(78009, "Rorshach"));
        System.out.println("Added region: " + reg);

        
        reg = db.getRegionById(6);
        System.out.println("Get region by ID: " + reg);

        
        boolean updated = db.updateRegion(new Regions(78009, "Pokino"));
        System.out.println("Update successful: " + updated);

        
        boolean removed = db.removeRegion(78009);
        System.out.println("Removal successful: " + removed);
    }
}
