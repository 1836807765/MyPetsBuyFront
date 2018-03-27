package com.pets.service;

import com.pets.dao.PetsToUserDAO;
import com.pets.dto.PetsToUserDTO;

public class PetsToUserService {
	private PetsToUserDAO dao = new PetsToUserDAO();
	
	
	public void insertAll() {

		dao.insertAll();
		
	}
	
	

}
