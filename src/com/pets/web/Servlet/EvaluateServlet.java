package com.pets.web.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pets.dto.EvaluateDTO;
import com.pets.dto.UserDTO;
import com.pets.service.EvaluateService;

/**
 * Servlet implementation class evaluateServlet
 */
@WebServlet("/evaluate")
public class EvaluateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EvaluateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	            UserDTO user=(UserDTO) req.getSession().getAttribute("user");		
				if(user==null)
				{
					req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
					return ;
				}
				System.out.println("页面提交");
				String message=req.getParameter("message");
				String title=req.getParameter("title");
				String type=req.getParameter("type");
				if(message==null||title==null||message.isEmpty()||title.isEmpty())
				{
					req.setAttribute("message", "请填写所有信息");
					req.getRequestDispatcher("/WEB-INF/user/evaluate.jsp").forward(req, resp);
			        
				}
				
		     	Long   pid = (long) Integer.parseInt(req.getParameter("pid"));

				EvaluateService evaluateService=new EvaluateService();

				EvaluateDTO evaluateDTO=new EvaluateDTO();
				evaluateDTO.setIsDeleted(false);
				evaluateDTO.setMessage(message);
				evaluateDTO.setTitle(title);
				
				System.out.println("商品评价成功");
				evaluateService.insert(pid,evaluateDTO, user);
				//跳转到评价的页面
				req.setAttribute("message", "评论提交成功");
				req.getRequestDispatcher("/WEB-INF/user/evaluate.jsp").forward(req, resp);
			
			
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
