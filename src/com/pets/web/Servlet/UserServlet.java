package com.pets.web.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pets.dao.OrderDAO;
import com.pets.dto.AddressDTO;
import com.pets.dto.EvaluateDTO;
import com.pets.dto.MessageDTO;
import com.pets.dto.OrderDTO;
import com.pets.dto.PetsDTO;
import com.pets.dto.UserDTO;
import com.pets.service.AddressService;
import com.pets.service.EvaluateService;
import com.pets.service.MessageService;
import com.pets.service.OrderService;
import com.pets.service.PetsService;
import com.pets.service.PetsToUserService;
import com.pets.service.ShopCarService;
import com.pets.service.UserService;
import com.pets.utils.AjaxResult;
import com.pets.utils.CommonUtils;


/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/User")
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	public void self(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserDTO user=(UserDTO) req.getSession().getAttribute("user");
		if(user==null)
		{
			req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
			return ;
		}
		//重新查询用户信息并存入
		UserService userService=new UserService();
		user=userService.selectUserByEmail(user.getEmail());
	    req.setAttribute("user", user);
		req.getRequestDispatcher("/WEB-INF/user/user_account.jsp").forward(req, resp);
		return ;
	}
	
	public void message(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		{
		UserDTO user=(UserDTO) req.getSession().getAttribute("user");
		if(user==null)
		{
			req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
			return ;
		}
		//遍历出所有的评价
		MessageService messageService=new MessageService();
		MessageDTO[] messagelist=messageService.getAll();
		
		req.setAttribute("messagelist", messagelist);
		req.getRequestDispatcher("/WEB-INF/user/user_message.jsp").forward(req, resp);

		}
	}
		
//	evaluate
	public void evaluate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDTO user=(UserDTO) req.getSession().getAttribute("user");
		Long pid = (long) Integer.parseInt(req.getParameter("id"));
        //获得当前pets的id
        
        
		if(user==null)
		{
			req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
			return ;
		}
		//跳转到评价的页面
		req.setAttribute("pid", pid);
		req.getRequestDispatcher("/WEB-INF/user/evaluate.jsp").forward(req, resp);

		
	
	}

	public void shopcar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDTO user=(UserDTO) req.getSession().getAttribute("user");
		
		if(user==null)
		{
			req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
			return ;
		}
		
		//遍历当前用户的所有货物
		PetsService petsService=new PetsService();
		PetsDTO[] petsList=petsService.selectPetsByUser(user);
	     
        if(petsList[0].getId()==0)
        {
        	Long pid=petsList[0].getId();
    		req.setAttribute("pid",pid);

        }
		req.setAttribute("petsList",petsList);
	    req.setAttribute("user", user);

		req.getRequestDispatcher("/WEB-INF/user/shopcar.jsp").forward(req, resp);
	}
	public void datum(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserDTO user=(UserDTO) req.getSession().getAttribute("user");
		if(user==null)
		{
			req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
			return ;
		}
		//重新查询用户信息并存入
		UserService userService=new UserService();
		user=userService.selectUserByEmail(user.getEmail());
		req.setAttribute("user", user);
		req.getRequestDispatcher("/WEB-INF/user/datum.jsp").forward(req, resp);
        return ;
	}

	
	
	public void order(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		UserDTO user=(UserDTO) req.getSession().getAttribute("user");
		if(user==null)
		{
			req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
			return ;
		}
        PetsToUserService petsToUserService = new PetsToUserService();
                
        
        
        
		PetsService petsService=new PetsService();
		PetsDTO[] petsList=petsService.selectOderByUser(user.getId());
//		待发货 确认收货
		
		OrderService orderService =new OrderService();
		OrderDTO[] orderlist=orderService.getallByUser(user.getId());
	    
		
		
		for(int i=0;i<petsList.length;i++)
		{
			petsList[i].setTid(orderlist[i].getId());
			
		}
		
		
		req.setAttribute("petsList", petsList);

		
		
		
		
		req.getRequestDispatcher("/WEB-INF/user/order.jsp").forward(req, resp);
	}
	public void orderdelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		UserDTO user=(UserDTO) req.getSession().getAttribute("user");
		if(user==null)
		{
			req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
			return ;
		}
		
		
	OrderService orderService=new OrderService();
	Long id = (long) Integer.parseInt(req.getParameter("id"));
	orderService.shouhuo(id);
    resp.sendRedirect("./User?action=order");
	
	}
	public void namechange(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDTO user=(UserDTO) req.getSession().getAttribute("user");
		if(user==null)
		{
			req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
			return ;
		}
		
		
		req.getRequestDispatcher("/WEB-INF/user/namechange.jsp").forward(req, resp);
	}
	public void changeSubmit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
		UserService userService= new UserService();
		UserDTO user=(UserDTO) req.getSession().getAttribute("user");
		if(user==null)
		{
			req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
			return ;
		}
		
		
		String name =req.getParameter("newname2");
	    user =userService.selectUserByEmail(user.getEmail());
		user.setName(name);
        userService.updateByUser(user);
		
		req.setAttribute("user", user);

		req.getRequestDispatcher("/WEB-INF/user/user_account.jsp").forward(req, resp);
	}
	/**
	 * 修改密码
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	public void sign(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/user/sign.jsp").forward(req, resp);
	}
	public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    
		req.getRequestDispatcher("/WEB-INF/user/user_account.jsp").forward(req, resp);
	}
	
	public void loginSubmit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		{
			
			String email = req.getParameter("user");
			String password = req.getParameter("pwd");
			UserService service = new UserService();
			//先判断是否存在这个账户
			if(service.isExist(email))
			{
				if(service.checkLogin(email, password))
				{
					   //保存账号
				 	 UserDTO user = new UserDTO();
				 	 user=service.selectUserByEmail(email);
				      
				 	 req.getSession().setAttribute("user", user);
				      int maxAge = 60*60*24;//账号保存一天  	
				       //添加cookie 
				      //账号
				      Cookie loginNameCookie = new Cookie("loginName", email);
				      loginNameCookie.setMaxAge(maxAge);//设置过期时间
				      loginNameCookie.setPath("/");
				      resp.addCookie(loginNameCookie);
				      //密码
				      Cookie passwordCookie = new Cookie("password", user.getPassword());
				      passwordCookie.setMaxAge(maxAge);
				      passwordCookie.setPath("/");
				      resp.addCookie(passwordCookie);
				      
//				  	req.getRequestDispatcher("/WEB-INF/Newindex.jsp").forward(req, resp);
                    resp.sendRedirect("./User?action=self");
					
				}
				else
				{

					req.setAttribute("message", "账账户不存在");
					req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
					return ;
				}
				
				
			}
			
			
			else
			{

				req.setAttribute("message", "账号密码错误");
				req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
				return ;
			}
		}
		
		
	}
/**
 * 注销
 * @param req
 * @param resp
 * @throws ServletException
 * @throws IOException
 */
	public void reset(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			  //销毁数据
			   req.getSession().invalidate();
			   int maxAge=0;
			   Cookie loginNameCookie = new Cookie("loginName", "");
		       loginNameCookie.setMaxAge(maxAge);
		       loginNameCookie.setPath("/");
		       resp.addCookie(loginNameCookie);

		       Cookie passwordCookie = new Cookie("password", "");
		       passwordCookie.setMaxAge(maxAge);
		       passwordCookie.setPath("/");
		       resp.addCookie(passwordCookie);
			   
			 req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
		}
	/**
	 * 重置密码
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
public void signSubmit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
{
	UserDTO user=(UserDTO) req.getSession().getAttribute("user");
    if(user==null)
    {
		 req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
         return ;
    }
	//设置密码
    
    String oldpassword=req.getParameter("oldpassword");
    //先比对原始账号是否正确
    if(!user.getPassword().equals(oldpassword))
    {
       	 req.setAttribute("message", "原始密码错误");
		 req.getRequestDispatcher("/WEB-INF/user/sign.jsp").forward(req, resp);
		 return;
    }
    String newpassword=req.getParameter("newpassword");
    String newpassword2=req.getParameter("newpassword2");
    if(!newpassword.equals(newpassword2))
    {
       	 req.setAttribute("message", "两次输入的密码不一致");
		 req.getRequestDispatcher("/WEB-INF/user/sign.jsp").forward(req, resp);
		 return;
    }
    
    UserService userService= new UserService();
    user.setPassword(newpassword);

    userService.updateByUser2(user);
    
//	req.setAttribute("user", user);
	req.setAttribute("message", "密码设置成功");
    req.getRequestDispatcher("./User?action=sign").forward(req, resp);
	return;
}
}
/**
 * 注册
 * @param req
 * @param resp
 * @throws ServletException
 * @throws IOException
 */
public void sign2(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
     req.getRequestDispatcher("/WEB-INF/user/sign2.jsp").forward(req, resp);

}
public void registerSubmit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	 System.out.println("注册成功");
	 String email= req.getParameter("email");
	 String password=req.getParameter("password");
	 String password2=req.getParameter("password2");
	 String name=req.getParameter("name");
	 String phone=req.getParameter("phone");

	 
	 System.out.println(email+password);
	 UserService userService = new UserService();

	 if(!CommonUtils.isEmail(email))
	 {
		 req.setAttribute("message", "邮箱格式不正确");
	     req.getRequestDispatcher("/WEB-INF/user/sign2.jsp").forward(req, resp);
			return ;


	 }
	 if(CommonUtils.isEmpty(password))
	 {
		 req.setAttribute("message", "密码不能为空");
	     req.getRequestDispatcher("/WEB-INF/user/sign2.jsp").forward(req, resp);
			return ;

		 
	 }
	 if(!password.equals(password2))
	 {
		 req.setAttribute("message", "两次密码输入不正确");
	     req.getRequestDispatcher("/WEB-INF/user/sign2.jsp").forward(req, resp);
			return ;

		 
	 }
	 if(userService.isExist(email))
	 {
		 req.setAttribute("message", "该邮箱已经存在");
	     req.getRequestDispatcher("/WEB-INF/user/sign2.jsp").forward(req, resp);
			return ;

		 
	 }
	 /*
	  * 执行业务逻辑
	  */
	 UserDTO user = new UserDTO();
	 user.setEmail(email);
	 user.setPassword(password);
	 user.setName(name);
	 user.setPhone(phone);
	 
	 userService.addnew(user);
	 System.out.println(email+password);
	 req.setAttribute("message", "注册成功 开始登陆吧");

	 req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
     
     return ;
	
	}
/**
 * 收获地址管理
 * 
 */
public void address(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	//查询出当前的所有地址
	  UserDTO user=(UserDTO) req.getSession().getAttribute("user");
	  AddressService addressService = new AddressService();

	 if(user==null)
	    {
			 req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
	    }
	 //根据id来查询出所有的收获地址
//    AddressDTO[] listAddress=addressService.selectListAddressByid(user.getId());
    AddressDTO listAddress=addressService.selectAddressByid(user.getId());
    
//    System.out.println(listAddress.toString());
    
	req.setAttribute("listAddress", listAddress);
    req.getRequestDispatcher("/WEB-INF/user/user_address.jsp").forward(req, resp);
}
public void goAddress(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	UserDTO user=(UserDTO) req.getSession().getAttribute("user");
	if(user==null)
	{
		
	    req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);

	}

    req.getRequestDispatcher("/WEB-INF/user/goaddres.jsp").forward(req, resp);
}
public void goAddressSubmit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
    AddressService addressService=new AddressService();

	UserDTO user=(UserDTO) req.getSession().getAttribute("user");
	 if(user==null)
	    {
			 req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
	    }
	
	
	String rname=req.getParameter("rname");
	String rphone=req.getParameter("rphone");
	String local=req.getParameter("local");
	String address=req.getParameter("address");
    System.out.println(rphone+rname+local+address);
    AddressDTO addressDTO=new AddressDTO();
    addressDTO.setAddress(address);
    addressDTO.setRphone(rphone);
    addressDTO.setLocal(local);
    addressDTO.setRname(rname);
    addressDTO.setUserId(user.getId());
    //如果存在，就修改，不存在就插入
	 if(addressService.isExist(user.getId()))
	 {
	addressService.update(user.getId(),addressDTO);
//	req.setAttribute("addressDTO", addressDTO);
	writeJson(resp, new AjaxResult("提交成功"));
	resp.sendRedirect("./User?action=address");
	return ;
		 
	 }
    /*
     * 执行业务逻辑
     */
    addressService.addnew(addressDTO);

//    req.setAttribute("addressDTO", addressDTO);
	writeJson(resp, new AjaxResult("提交成功"));
	resp.sendRedirect("./User?action=address");
}
public void buy(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	 UserDTO user=(UserDTO) req.getSession().getAttribute("user");
	 if(user==null)
	    {
			 req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
	         return ;
	    }
	 /*
	  * 数据同步到订单
	  */
      OrderService OrderService=new OrderService();
//      System.out.println(user.getId());
      OrderService.strage(user.getId());
	
     PetsToUserService petsToUserService=new PetsToUserService();
	 petsToUserService.insertAll();
	 /*
	  * 购物车业务逻辑删除
	  */
	 UserService userService=new UserService();
	 userService.push(user.getId());
	
	
	 System.out.println("购物成功");
	 writeJson(resp, new AjaxResult("ok"));
	 resp.sendRedirect("./User?action=order");
	 //在订单中新建数据

	 
}
public void ShowAddress(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
{
	 UserDTO user=(UserDTO) req.getSession().getAttribute("user");
	 if(user==null)
	    {
			 req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
	         return ;
	    }
	
}
}
