package com.pets.service;

import com.pets.dao.MessageDAO;
import com.pets.dto.MessageDTO;
import com.pets.dto.UserDTO;

public class MessageService {

	private MessageDAO messageDAO=new MessageDAO();
	
	public void insert(MessageDTO messageDto,UserDTO userDto)
	{
		messageDAO.addnew(messageDto, userDto);
		
		
	}

	public MessageDTO[] getAll() {

		return messageDAO.getAll();
		
		
	}
	
	
	
}
