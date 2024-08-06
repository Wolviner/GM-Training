package com.grayMatter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

    public List<Item> getItems() throws SQLException, ClassNotFoundException {
        List<Item> items = new ArrayList<>();
        Connection con = new DataSourceClass().getConnection();
        String query = "SELECT * FROM items";
        PreparedStatement stmt = con.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Item item = new Item();
            item.setId(rs.getInt("id"));
            item.setName(rs.getString("name"));
            item.setCost(rs.getDouble("cost"));
            items.add(item);
        }
        rs.close();
        stmt.close();
        con.close();
        return items;
    }
}
