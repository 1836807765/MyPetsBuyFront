package com.pets.service;

import java.util.List;

import com.pets.dao.OrderDAO;
import com.pets.dto.OrderDTO;

public class OrderService {

private OrderDAO OrderDao=new OrderDAO();	
	public long addnew(Long userId,Long petsId)
	{
		return OrderDao.addnew(userId, petsId);
		
	}
	public void strage(Long userid) {

	 OrderDao.strage(userid);
		
	}
	public void shouhuo(Long id) {
          OrderDao.shouhuo(id);		
	}
	public OrderDTO[] getallByUser(Long id) {

	return OrderDao.getallByUser(id);
	
	}
	
	
}
