package com.pets.web.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pets.dto.MessageDTO;
import com.pets.dto.PetsDTO;
import com.pets.dto.UserDTO;
import com.pets.service.MessageService;
import com.pets.service.PetsService;
import com.pets.service.UserService;

/**
 * Servlet implementation class UeditorServlet
 */
@WebServlet("/UeditorServlet")
public class UeditorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UeditorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        //设置请求和响应的编码统一为UTF-8
		UserDTO user=(UserDTO) request.getSession().getAttribute("user");
       
		        request.setCharacterEncoding("UTF-8");
		        response.setCharacterEncoding("UTF-8");
		        //拿到编辑器的内容
		        String content = request.getParameter("editorValue");
		        String Anonmouy = request.getParameter("checked");
	            UserService userService=new UserService();

		        
		        //如果不为空
		        if(content != null){
		            //将内容设置进属性
		        	if(Anonmouy!=null&&!Anonmouy.equals(""))
		        	{
		        		UserDTO userdto=new UserDTO();
		        		userdto.setName("匿名者");MessageService messageService=new MessageService();
			            MessageDTO messageDto=new MessageDTO();
			            messageDto.setContent(content);
			            messageService.insert(messageDto, userdto);
			            userService.evaluate(user);
                        request.setAttribute("message", "提交成功积分+20");
			            response.sendRedirect("./User?action=message");

		        	}
		        	else{
		            MessageService messageService=new MessageService();
		            MessageDTO messageDto=new MessageDTO();
		            messageDto.setContent(content);
		            messageService.insert(messageDto, user);
                    request.setAttribute("message", "提交成功积分+20");
		            userService.evaluate(user);

		            
		            //转发到content.jsp
		            response.sendRedirect("./User?action=message");
		        	}
		        }else{
			        response.setCharacterEncoding("UTF-8");

		            response.getWriter().append("	Content is empty!");
		        }
		    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
