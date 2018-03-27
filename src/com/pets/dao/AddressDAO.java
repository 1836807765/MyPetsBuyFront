package com.pets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.pets.dto.AddressDTO;
import com.pets.dto.UserDTO;
import com.pets.utils.JDBCUtils;


public class AddressDAO {
	public static AddressDTO toModel(ResultSet rs) throws SQLException
	{
		AddressDTO addressDto = new AddressDTO();
		addressDto.setId(rs.getLong("Id"));
		addressDto.setRname(rs.getString("rname"));
		addressDto.setUserId(rs.getLong("userid"));
		addressDto.setLocal(rs.getString("local"));
		addressDto.setAddress(rs.getString("address"));
		addressDto.setRphone(rs.getString("rphone"));
		addressDto.setIsEnable(rs.getBoolean("isEnable"));
		return addressDto;
	}
	public void addnew(AddressDTO addressDto) {

        String rname=addressDto.getRname();
        String rphone=addressDto.getRphone();
		Long userid=addressDto.getUserId();
        String local=addressDto.getLocal();
        String address=addressDto.getAddress();   
		try {		

//			JDBCUtils.executeNonQuery("update t_addresses set isEnable = ?",false);
			JDBCUtils.executeInsert("insert into t_addresses(rname,rphone,local,address,userid,isEnable) values(?,?,?,?,?,?)",rname, rphone,local,address,userid,true);
		}
		catch (SQLException e) 
		{
			throw new RuntimeException(e);
		}
	}
	/*
	 * crazy
	 */
	public AddressDTO[] selectListAddressByid(Long id) {
			StringBuilder sb = new StringBuilder();
			/*
			 * select a.* from t_users u left join t_addresses a on u.id=a.userid where userid = 1
			 */
			sb.append("select a.* from t_users u ");
			sb.append("left join t_addresses a on u.id=a.userid where userid =?");

			List<AddressDTO> list = new ArrayList<>();
			ResultSet rs = null;
			try {
				rs = JDBCUtils.executeQuery(sb.toString(), id);
				while (rs.next()) {
					list.add(toModel(rs));
				}
				return list.toArray(new AddressDTO[list.size()]);
			} catch (SQLException ex) {
				throw new RuntimeException(ex);
			} finally {
				JDBCUtils.closeAll(rs);
			}

		}
	public AddressDTO selectAddressByid(Long id) {
		ResultSet rs = null;
		try
		{
			rs = JDBCUtils.executeQuery(
					"select * from t_addresses where userid =? ", id);
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
	public void update(Long id,AddressDTO addressDto) {

		    String rname=addressDto.getRname();
	        String rphone=addressDto.getRphone();
	        String local=addressDto.getLocal();
	        String address=addressDto.getAddress();   
			try {		
				JDBCUtils.executeNonQuery("update t_addresses set "
						+ "rname = ? , rphone =? , local =? ,address= ? where userid=?",
						rname ,rphone,local ,address,id);

//				JDBCUtils.executeNonQuery("update t_addresses set isEnable = ?",false);
			}
			catch (SQLException e) 
			{
				throw new RuntimeException(e);
			}
		}
		
		

	
}
