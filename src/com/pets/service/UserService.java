package com.pets.service;

import java.util.List;

import com.pets.dao.UserDAO;
import com.pets.dto.AddressDTO;
import com.pets.dto.PetsDTO;
import com.pets.dto.UserDTO;

public class UserService {

	private UserDAO dao = new UserDAO();

	public UserDTO selectUserByEmail(String email)
	{
		
		return dao.getByUserEmail(email);
		
	}

	public void updateByUser(UserDTO user) {

		dao.updateByUser(user);
		
		
	}

	public boolean checkLogin(String email, String password) {

	 if(dao.checkLogin(email, password))
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
	
	
	}
	//判断是否已经存在
	   public boolean isExist(String  email) {
	       UserDTO userDto = dao.getByUserEmail(email);
	       return userDto != null ;
	   }

	public void addnew(UserDTO user) {
		
	dao.addnew(user);	
		
	}

	public  void push(Long id) {

		dao.push(id);
		
	}

	public void updateByUser2(UserDTO user) {
		dao.updateByUser2(user);

	}

	public void evaluate(UserDTO user) {
		dao.evaluate(user);
		
	}

	
}
