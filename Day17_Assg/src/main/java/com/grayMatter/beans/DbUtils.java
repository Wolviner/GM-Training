package com.grayMatter.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DbUtils implements DbInterface {

    Connection con;

    @Override
    public List<Regions> getAll() throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM regions");
        List<Regions> rlist = new ArrayList<>();
        while (rs.next()) {
            rlist.add(new Regions(rs.getInt(1), rs.getString(2)));
        }
        return rlist;
    }

    @Override
    public Regions addregion(Regions region) throws SQLException {
        PreparedStatement ps = con.prepareStatement("INSERT INTO regions VALUES (?, ?)");
        ps.setInt(1, region.getRid());
        ps.setString(2, region.getRname());
        int affected_rows = ps.executeUpdate();
        return affected_rows > 0 ? region : null;
    }

    @Override
    public Regions getRegionById(int rid) throws SQLException {
        PreparedStatement ps = con.prepareStatement("SELECT * FROM regions WHERE region_id = ?");
        ps.setInt(1, rid);
        ResultSet rs = ps.executeQuery();
        Regions savedRegion = null;
        if (rs.next()) {
            savedRegion = new Regions(rs.getInt(1), rs.getString(2));
        }
        return savedRegion;
    }

    @Override
    public boolean removeRegion(int rid) throws SQLException {
        PreparedStatement ps = con.prepareStatement("DELETE FROM regions WHERE region_id = ?");
        ps.setInt(1, rid);
        int affected_rows = ps.executeUpdate();
        return affected_rows > 0;
    }

    @Override
    public boolean updateRegion(Regions region) throws SQLException {
        PreparedStatement ps = con.prepareStatement("UPDATE regions SET region_name = ? WHERE region_id = ?");
        ps.setString(1, region.getRname());
        ps.setInt(2, region.getRid());
        int affected_rows = ps.executeUpdate();
        return affected_rows > 0;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
