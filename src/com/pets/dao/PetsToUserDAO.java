package com.pets.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pets.dto.OrderDTO;
import com.pets.dto.PetsToUserDTO;
import com.pets.dto.UserDTO;
import com.pets.service.UserService;
import com.pets.utils.JDBCUtils;

public class PetsToUserDAO {
	

	

	public static PetsToUserDTO toModel(ResultSet rs) throws SQLException
	{
		PetsToUserDTO petsUser = new PetsToUserDTO();
	    petsUser.setIsDeleted(rs.getBoolean("isDeleted"));
        petsUser.setUsername(rs.getString("username"));
        petsUser.setPetsName(rs.getString("name"));
        petsUser.setAddress(rs.getString("address"));
        petsUser.setLocal(rs.getString("local"));
        petsUser.setPhone(rs.getString("rphone"));
        petsUser.setRname(rs.getString("rname"));
        petsUser.setSale(rs.getString("sale"));
        return petsUser;
	}

	
	public void  insertAll() {

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
		/*
		 * select p.*,u.name as username from t_orders o 
left join t_pets p on p.id = o.petsid
left join t_users u on u.id = o.userid
left join t_addresses a on a.userid = u.id
where o.isDeleted = false and a.isEnable = true

		 */
		/*
		 * select p.*,u.name as username from t_shopcars o 
left join t_pets p on p.id = o.petsid
left join t_users u on u.id = o.userid
left join t_addresses a on a.userid = u.id
where  a.isEnable = true

		 */
		sb.append(" select a.* ,p.*,u.name as username from t_shopcars o ");
		sb.append(" left join t_pets p on p.id = o.petsid  ");
		sb.append(" left join t_users u on u.id = o.userid  ");
		sb.append(" left join t_addresses a on a.userid = u.id  ");
		sb.append(" where  a.isEnable = true ");
		List<PetsToUserDTO> list = new ArrayList<>();
		ResultSet rs = null;
		try {
			rs = JDBCUtils.executeQuery(sb.toString());
			while (rs.next()) {
				PetsToUserDTO petsDto=toModel(rs);
				JDBCUtils.executeInsert("insert into t_PetsToUsers"
						+ "(address,petsName,isDeleted,username,phone,rname,local,sale)"
						+ " values(?,?,?,?,?,?,?,?)",petsDto.getAddress(), petsDto.getPetsName(),false,petsDto.getUsername(),petsDto.getPhone(),petsDto.getRname(),
						petsDto.getLocal(),petsDto.getSale());
                         
			}
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		} finally {
			JDBCUtils.closeAll(rs);
		}

		
		
	}




	
	
	
}
