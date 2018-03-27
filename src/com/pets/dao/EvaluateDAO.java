package com.pets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;

import com.pets.dto.AddressDTO;
import com.pets.dto.EvaluateDTO;
import com.pets.dto.PetsDTO;
import com.pets.dto.UserDTO;
import com.pets.utils.JDBCUtils;

public class EvaluateDAO {

	/**
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static EvaluateDTO toModel(ResultSet rs) throws SQLException
	{
		EvaluateDTO evaluate = new EvaluateDTO();
        evaluate.setId(rs.getLong("id"));		
		evaluate.setMessage(rs.getString("message"));
		evaluate.setTitle(rs.getString("title"));
	    evaluate.setUserid(rs.getLong("userid"));
		evaluate.setUsername(rs.getString("username"));
		evaluate.setAnswer(rs.getString("answer"));
	    evaluate.setPetsid(rs.getLong("petsid"));
	    return evaluate;
	}
	/**	
	 * 插入评价
	 */
	public void addnew(UserDTO userDto,EvaluateDTO evaluateDto,Long oid) {
		try {
			
     	 JDBCUtils.executeInsert("insert into t_evaluates(message,userid,username,title,isDeleted,petsid) values(?,?,?,?,false,?)",evaluateDto.getMessage(),userDto.getId(),userDto.getName(),evaluateDto.getTitle(),oid);
	
		}
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
	}
	public EvaluateDTO[] getAllbyPetsId(Long id) {
		/*
		 * select u.name , e.* from t_pets p left join t_evaluates e on p.id =e.petsid 
left join t_users u on e.userid = u.id
where p.id =46
		 */

		List<EvaluateDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery("select u.name , e.* from t_pets p left join t_evaluates e on p.id =e.petsid  "
					+ "   left join t_users u on e.userid = u.id where p.id = ? ",id);
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new EvaluateDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}
		
	}
	public EvaluateDTO[] getAll() {
		
		
		
		List<EvaluateDTO> list = new ArrayList<>();
		ResultSet rs = null;
		//查询出所有 
		try {
			rs = JDBCUtils.executeQuery("select * from t_evaluates where isDeleted =false ");
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new EvaluateDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}

	
	
	
	
	
	}
	public void update(EvaluateDTO evaluateDTO,Long id) {
		
		 String answer=evaluateDTO.getAnswer();

			if(id==null)
			{
				throw new IllegalArgumentException("错误");
			}
	        try {
				JDBCUtils.executeNonQuery("update t_evaluates set answer=? where id = ?",answer,id);
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
					
		}
}
	
	
	
