package com.pets.web.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pets.dto.EvaluateDTO;
import com.pets.dto.PetsDTO;
import com.pets.dto.UserDTO;
import com.pets.service.EvaluateService;
import com.pets.service.PetsService;
import com.pets.service.ShopCarService;

/**
 * Servlet implementation class ShopServlet
 */
@WebServlet("/shop")
public class ShopServlet extends BaseServlet{
	public void detail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{	
		//强制转换id
		Long id = (long) Integer.parseInt(req.getParameter("id"));
		//根据id来查询商品的信息,并存放到流中
		PetsDTO petsDto = new PetsDTO();
		petsDto.setId(id);
		PetsService petsService=new PetsService();
		petsDto=petsService.getByPetsId(id);
		EvaluateService evaluateService=new EvaluateService();
		EvaluateDTO[] eva=evaluateService.getAllbyPetsId(id);
		
		
		req.setAttribute("eva", eva);

		req.setAttribute("petsDto", petsDto);
		req.getRequestDispatcher("/WEB-INF/shop/goods.jsp").forward(req, resp);
		
	}
	public void detailSubmit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	    //先判断用户是否存在
		UserDTO user=(UserDTO) req.getSession().getAttribute("user");
		if(user==null)
		{
			req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
            return ;
		}
		//强制转换id
				Long petsid = (long) Integer.parseInt(req.getParameter("id"));
		        //插入一条数据到用户的购物车
				//分别记录商品的名字和用户的名字
				Long userid=user.getId();
				ShopCarService shopCarService=new ShopCarService();
				shopCarService.addnew(userid,petsid);
				
                
                resp.sendRedirect("./User?action=shopcar");
		
	}


}
