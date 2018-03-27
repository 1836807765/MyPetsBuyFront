package com.pets.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.pets.dto.AddressDTO;
import com.pets.dto.PetsDTO;
import com.pets.dto.UserDTO;
import com.pets.service.UserService;
import com.pets.utils.JDBCUtils;

public class UserDAO
{
	/**
	 * 根据用户名获得用户对象
	 * @param username
	 * @return
	 */
	public static UserDTO getByUserEmail(String Email)
	{
		
		ResultSet rs = null;
		try
		{
			rs = JDBCUtils.executeQuery(
					"select * from T_Users where email=?", Email);
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

	public static UserDTO toModel(ResultSet rs) throws SQLException
	{
		UserDTO user = new UserDTO();
		user.setId(rs.getLong("Id"));
		user.setEmail(rs.getString("Email"));
		user.setPassword(rs.getString("password"));
		user.setName(rs.getString("name"));
		user.setScore(rs.getLong("score"));
		user.setMoney(rs.getFloat("money"));
        user.setPhone(rs.getString("phone"));
        user.setAddress(rs.getString("address"));
        user.setDescription(rs.getString("description"));
        user.setMajor(rs.getString("major"));
		return user;
	}

	
	/**
	 * 检查账号密码是否正确
	 */
	public boolean checkLogin(String email,String password)
	{
		UserDTO userdto= new UserDTO();
	    UserService userService = new UserService();
	    userdto=userService.selectUserByEmail(email);
	    System.out.println(userdto.toString());
		if(userdto.getPassword().equals(password))
		{
			return true;
		}
	    
		return false;
		
		
	}
/**
 * 
 * @param user
 */
public void updateByUser(UserDTO user) {
		if(user==null)
		{
			throw new IllegalArgumentException("错误");
		}
        try {
			JDBCUtils.executeNonQuery("update t_users set password=? ,major=?,description=?,name=?,phone=? where email=?", user.getPassword(),user.getMajor(),user.getDescription(),user.getName(),user.getPhone(),user.getEmail());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * 
	 * @param user
	 * @return
	 */
public long addnew(UserDTO user) {
		String email=user.getEmail();
		String password=user.getPassword();
		String name="会员";
		try {
			
     	return JDBCUtils.executeInsert("insert into T_Users(email,password,name,score,phone) values(?,?,?,1000,?)",email, password,name,user.getPhone());
	
		}
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
	}
/*
 * 
 */
/*
 * many to many
 * 
select p.* from t_users u left join t_shopcars s on u.id=s.userid 
left join t_pets p on s.petsid = p.id where u.id=1
 */

	public void push(Long userid) {
		try {
			
	     	 JDBCUtils.executeInsert("delete from t_shopcars where userid=?",userid);
		
			}
			catch (SQLException e) 
			{
				throw new RuntimeException(e);
			}
	}

	public void updateByUser2(UserDTO user) {
		if(user==null)
		{
			throw new IllegalArgumentException("错误");
		}
        try {
			JDBCUtils.executeNonQuery("update t_users set password=? where email=?",user.getPassword(),user.getEmail());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}

	public void evaluate(UserDTO user) {
		Long score=user.getScore();
		score=score+20;
		
		if(user==null)
		{
			throw new IllegalArgumentException("错误");
		}
        try {
			JDBCUtils.executeNonQuery("update t_users set score=? where email=?",score,user.getEmail());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}	
		
	}
	
}
