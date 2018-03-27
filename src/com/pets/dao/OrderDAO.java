package com.pets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pets.dto.OrderDTO;
import com.pets.utils.JDBCUtils;


public class OrderDAO {
	public static OrderDTO toModel(ResultSet rs) throws SQLException
	{
		OrderDTO orderDto=new OrderDTO();
		orderDto.setPetsid(rs.getLong("petsid"));
	    orderDto.setUserid(rs.getLong("userid"));
	    orderDto.setId(rs.getLong("id"));
	    orderDto.setIsDeleted(rs.getBoolean("isDeleted"));
        return orderDto;
	}

	public long addnew(Long userId,Long petsId) {
		try {
			
     	return JDBCUtils.executeInsert("insert into t_orders(userId,petsId,isDeleted) values(?,?,?)",userId, petsId,false);
	
		}
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
	}
	/**
	 * 	public PetsDTO[] selectPetsByUser(UserDTO user) {
	 */
	
	public void strage(Long userid) 
	{
		List<OrderDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery("select * from t_shopcars where userId=?",userid);
			while (rs.next()) {
				OrderDTO orderDto=new OrderDTO();
				orderDto.setPetsid(rs.getLong("petsid"));
			    orderDto.setUserid(rs.getLong("userid"));
			    orderDto.setIsDeleted(false);
				JDBCUtils.executeInsert("insert into t_orders (userid,petsid,isDeleted) values(?,?,?)",orderDto.getUserid(),orderDto.getPetsid(),orderDto.getIsDeleted());
			}

		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}
	
	}
	public OrderDTO[] getAll() {

		StringBuilder sb = new StringBuilder();
		/*
		 * select a.* from t_admins u left join t_addresses a on u.id=a.adminid where adminid = 1
		 */
		/*
		 * #选中 所有商品
select p.*,u.name from t_orders o left join t_pets p on p.id = o.petsid
left join t_users u on u.id = o.userid
where o.isDeleted = false
		 */
		sb.append("select * from t_orders where isDeleted = false");

		List<OrderDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery(sb.toString());
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new OrderDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}

		
		
	}

	public OrderDTO[] getallByUser(Long id) {
		StringBuilder sb = new StringBuilder();
		sb.append("select * from t_orders where isDeleted = false and userid=?");

		List<OrderDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery(sb.toString(),id);
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new OrderDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}
		
	}

	public void shouhuo(Long id) {
		if(id==null)
		{
			throw new IllegalArgumentException("错误");
		}
        try {
			JDBCUtils.executeNonQuery("update t_orders set isDeleted =true where id =?",id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}
	
	
	
}
