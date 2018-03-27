package com.pets.web.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pets.dto.UserDTO;
import com.pets.service.UserService;

@WebServlet("/UserChangeSubmit")
public class UserChangeSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		UserService userService= new UserService();
		String description=request.getParameter("description");
		String major=request.getParameter("major");
		String phone=request.getParameter("phone");

		UserDTO user=(UserDTO) request.getSession().getAttribute("user");

		if(user==null)
		{
			request.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(request, response);
			return ;
		}
		
		
		String name =request.getParameter("name");
	    user =userService.selectUserByEmail(user.getEmail());
	    user.setPhone(phone);
		user.setName(name);
		user.setDescription(description);
		user.setMajor(major);
		
        userService.updateByUser(user);
		request.setAttribute("user", user);
        request.setAttribute("message", "保存成功");
		request.getRequestDispatcher("/WEB-INF/user/user_account.jsp").forward(request, response);
		return ;
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
