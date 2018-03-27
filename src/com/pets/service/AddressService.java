package com.pets.service;

import java.util.List;

import com.pets.dao.AddressDAO;
import com.pets.dto.AddressDTO;
import com.pets.dto.UserDTO;

public class AddressService {

	
	private AddressDAO dao = new AddressDAO();
	   public boolean isExist(Long  id) {
	       AddressDTO addressDto = dao.selectAddressByid(id);
	       //查询id用户 并更新
	       return addressDto != null ;
	   }
	public void addnew(AddressDTO addressDto) {
		
	dao.addnew(addressDto);	
		
	}

	public AddressDTO[] selectListAddressByid(Long id) {
     return dao.selectListAddressByid(id);
	}

	public AddressDTO selectAddressByid(Long id) {
		return dao.selectAddressByid(id);
	}
	public void update(Long id, AddressDTO addressDTO) {
		dao.update(id,addressDTO);
	}
	
	
	
}
