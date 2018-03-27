package com.pets.web.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pets.dto.PetsDTO;
import com.pets.dto.UserDTO;
import com.pets.service.PetsService;
import com.pets.service.UserService;


@WebServlet("/Index")
public class indexServlet extends BaseServlet  {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
//     * 测试
    	/*
    	 * 获得当前所有宠物相关
    	 */
    	PetsService petService = new PetsService();
        PetsDTO[] listAll=petService.getAll();
    	req.setAttribute("listAll", listAll);
    	
    	req.getRequestDispatcher("/WEB-INF/Newindex.jsp").forward(req, resp);

    }
    public void assort(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	PetsService petService = new PetsService();
        PetsDTO[] listDog=petService.getAllDOG();
    	req.setAttribute("listDog", listDog);
        req.getRequestDispatcher("/WEB-INF/assort.jsp").forward(req, resp);
    }
 /**
  * 显示狗狗
  * @param req
  * @param resp
  * @throws ServletException
  * @throws IOException
  */
    public void show(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	PetsService petService = new PetsService();
        PetsDTO[] listPets=petService.getAll();
    	req.setAttribute("listPets", listPets);
        req.getRequestDispatcher("/WEB-INF/gallery.jsp").forward(req, resp);

    }
    public void showDog(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    	PetsService petService = new PetsService();
        PetsDTO[] listPets=petService.getAllDOG();
    	req.setAttribute("listPets", listPets);
        req.getRequestDispatcher("/WEB-INF/gallery.jsp").forward(req, resp);

    }
    public void showCat(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	PetsService petService = new PetsService();
        PetsDTO[] listPets=petService.getAllCat();
        //
    	req.setAttribute("listPets", listPets);
        req.getRequestDispatcher("/WEB-INF/gallery.jsp").forward(req, resp);

    }
    	
   public void showPlay(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    	PetsService petService = new PetsService();
        PetsDTO[] listPets=petService.getAllPlay();
    	req.setAttribute("listPets", listPets);
        req.getRequestDispatcher("/WEB-INF/gallery.jsp").forward(req, resp);

    }
  public void about(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        req.getRequestDispatcher("/WEB-INF/about.jsp").forward(req, resp);

    }

}
