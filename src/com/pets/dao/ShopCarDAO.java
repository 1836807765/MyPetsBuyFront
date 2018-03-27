package com.pets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.pets.dto.ShopCarDTO;
import com.pets.dto.UserDTO;
import com.pets.utils.JDBCUtils;

public class ShopCarDAO {
	public static ShopCarDTO toModel(ResultSet rs) throws SQLException
	{
		ShopCarDTO car = new ShopCarDTO();
		car.setId(rs.getLong("Id"));
		car.setId(rs.getLong("userId"));
		car.setId(rs.getLong("petsId"));

		return car;
	}
	/**
	 * 插入一组数据
	 * @param user
	 * @return
	 */
	public long addnew(Long userId,Long petsId) {
		try {
			
     	return JDBCUtils.executeInsert("insert into t_shopcars(userId,petsId) values(?,?)",userId, petsId);
	
		}
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
	}
	
	
	
	
	
	
}
