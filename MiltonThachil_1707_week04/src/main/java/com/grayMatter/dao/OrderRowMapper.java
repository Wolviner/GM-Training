package com.grayMatter.dao;
import com.grayMatter.model.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.grayMatter.model.Customer;
import com.grayMatter.model.Orders;


	public class OrderRowMapper implements RowMapper<Orders> {

		@Override
		public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
			Orders o=new Orders(rs.getInt(1),rs.getDate(2),rs.getDouble(3),rs.getInt(4));
			return o;
		}
}
