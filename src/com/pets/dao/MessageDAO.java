package com.pets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pets.dto.MessageDTO;
import com.pets.dto.PetsDTO;
import com.pets.dto.UserDTO;
import com.pets.utils.JDBCUtils;

public class MessageDAO {
	public static MessageDTO toModel(ResultSet rs) throws SQLException
	{
		MessageDTO messageDto = new MessageDTO();
		messageDto.setContent(rs.getString("content"));
		messageDto.setId(rs.getLong("id"));
		messageDto.setUserid(rs.getLong("userid"));
		messageDto.setUsername(rs.getString("username"));
		return messageDto;
	}
	/**
	 * 插入一条信息
	 * @param messageDto
	 * @param userid
	 * @return
	 */
	public long addnew(MessageDTO messageDto,UserDTO userdto) {
		try {
			
     	return JDBCUtils.executeInsert("insert into T_Messages(userid,content,username) values(?,?,?)",userdto.getId(),messageDto.getContent(),userdto.getName());
	
		}
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
	}
	public MessageDTO[] getAll() {

		List<MessageDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery("select * from t_messages");
			while (rs.next()) {
				list.add(toModel(rs));
			}
			return list.toArray(new MessageDTO[list.size()]);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}
		
		
	}
}
