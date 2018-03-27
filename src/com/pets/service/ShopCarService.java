package com.pets.service;

import com.pets.dao.ShopCarDAO;

public class ShopCarService {

private	ShopCarDAO shopCarDao=new ShopCarDAO();
	public void addnew(Long userid, Long petsid)
	{
		shopCarDao.addnew(userid, petsid);	
	}
	
	
	
	
	

}
