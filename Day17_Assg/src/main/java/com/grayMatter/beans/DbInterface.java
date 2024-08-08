package com.grayMatter.beans;

import java.sql.SQLException;
import java.util.List;

public interface DbInterface {
	public List<Regions> getAll() throws SQLException;
	public Regions addregion(Regions region) throws SQLException;
//	public Regions deleteregion(Regions region);
//	public Regions updateregion(Regions region);
	public Regions getRegionById(int rid) throws SQLException;
	boolean updateRegion(Regions region) throws SQLException;
	boolean removeRegion(int rid) throws SQLException;

}
