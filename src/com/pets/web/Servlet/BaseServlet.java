package com.pets.web.Servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pets.utils.AjaxResult;
/**
 * 通用的servlet所有的都继承于这个
 * @author Ray
 *
 */
public class BaseServlet extends HttpServlet {
	private static final Logger logger = LogManager.getLogger(BaseServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if(StringUtils.isEmpty(action))
		{
			FrontUtils.showError(req, resp, "action不能为空");
			return;
		}
		try {
			Method methodAction = this.getClass().getMethod(action, HttpServletRequest.class,HttpServletResponse.class);
			if(methodAction==null)
			{
				FrontUtils.showError(req, resp, "找不到名字为"+action+"的方法");
				return;
			}
			methodAction.invoke(this, req,resp);
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
				| IllegalArgumentException | InvocationTargetException e) {
			logger.error("action调用出现错误："+action, e);
			FrontUtils.showError(req, resp, "action调用出现错误："+action);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
	protected void writeJson(HttpServletResponse resp,AjaxResult ajaxResult) throws IOException
	{
		resp.setContentType("application/json");
		resp.getWriter().print(ajaxResult.toJson());
	}
	
}
