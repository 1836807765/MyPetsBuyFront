package com.pets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pets.dto.PetsDTO;
import com.pets.dto.UserDTO;
import com.pets.utils.JDBCUtils;


public class PetsDAO {

	/**
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static PetsDTO toModel(ResultSet rs) throws SQLException
	{
		PetsDTO pets = new PetsDTO();
		pets.setId(rs.getLong("Id"));
		pets.setName(rs.getString("name"));
		pets.setDescription(rs.getString("description"));
		pets.setImage(rs.getString("image"));
		pets.setType(rs.getString("type"));
        pets.setAge(rs.getFloat("age"));	
        pets.setSale(rs.getFloat("sale"));
		return pets;
	}
	/**
	 * 
	 * @return
	 */
	public static PetsDTO[] getALLDOG()
	{
		List<PetsDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery("select * from t_pets where type=? and isDeleted = false","dog");
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new PetsDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}
	}
	/**
	 * 
	 * @return
	 */
	public static PetsDTO[] getALL()
	{
		List<PetsDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery("select * from t_pets where isDeleted = false");
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new PetsDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public static PetsDTO getByPetsId(Long id)
	{
		ResultSet rs = null;
		try
		{
			rs = JDBCUtils.executeQuery(
					"select * from t_pets where id=? and isDeleted = false", id);
			if (rs.next())
			{
				return toModel(rs);
			} else
			{
				return null;
			}
		} catch (SQLException e)
		{
			throw new RuntimeException(e);
		} finally
		{
			JDBCUtils.closeAll(rs);
		}
	}
	/**
	 * 
	 * @return
	 */
	public PetsDTO[] getALLCat() {
		List<PetsDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery("select * from t_pets where type=? and isDeleted = false","cat");
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new PetsDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}
	}
	/**
	 * 
	 * @return
	 */
	public PetsDTO[] getPlay() {
		List<PetsDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery("select * from t_pets where type=? and isDeleted = false","play");
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new PetsDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}
	}
	/**
	 * 
	 * @param user
	 * @return
	 */
	public PetsDTO[] selectPetsByUser(UserDTO user) {
        Long id=user.getId();
		StringBuilder sb = new StringBuilder();
		sb.append("select p.* from t_users u left join t_shopcars s on u.id=s.userid  ");
		sb.append("left join t_pets p on s.petsid = p.id where u.id=?");
		List<PetsDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery(sb.toString(), id);
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new PetsDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}

	}
	/**
	 * select p.* from t_orders s left join t_pets p on p.id=s.petsid where userid = 1
	 * @param id
	 * @return
	 */
	public PetsDTO[] selectOderByUser(Long id) {
		StringBuilder sb = new StringBuilder();
		/*
		 * select a.* from t_users u left join t_addresses a on u.id=a.userid where userid = 1
		 */
		sb.append("select p.* from t_orders s left join t_pets p ");
		sb.append("on p.id=s.petsid where userid  =? and s.isDeleted = false");

		List<PetsDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery(sb.toString(), id);
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new PetsDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}

	}
	public void insert(PetsDTO pets) {

		
		String image=pets.getImage();
		String description=pets.getDescription();
		String name=pets.getName();
		Float age=pets.getAge();
		Float sale=pets.getSale();
		String type=pets.getType();
        Boolean isDeleted = false;

        try {
			
     	 JDBCUtils.executeInsert("insert into t_pets(image,description,name,age,type,sale,isDeleted) values(?,?,?,?,?,?,?)",image,description,name,age,type,sale,isDeleted);
	
		}
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
		
		
		
		
		
		
	}

}
