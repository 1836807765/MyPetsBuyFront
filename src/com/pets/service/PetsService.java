package com.pets.service;

import com.pets.dao.PetsDAO;
import com.pets.dto.PetsDTO;
import com.pets.dto.UserDTO;

public class PetsService {
private PetsDAO petsDAO = new PetsDAO();


public PetsDTO[] getAllDOG()
{
	return petsDAO.getALLDOG();
	
}
public PetsDTO getByPetsId(Long id)
{
	
    return petsDAO.getByPetsId(id);

}
public PetsDTO[] getAllCat() {

    return petsDAO.getALLCat();

}
public PetsDTO[] getAllPlay() {

	return petsDAO.getPlay();

}
public PetsDTO[] getAll() {

	return petsDAO.getALL();

}

public PetsDTO[] selectPetsByUser(UserDTO user) {
	
	return petsDAO.selectPetsByUser(user);
	
}
public PetsDTO[] selectOderByUser(Long id) {
	return petsDAO.selectOderByUser(id);

}


}
