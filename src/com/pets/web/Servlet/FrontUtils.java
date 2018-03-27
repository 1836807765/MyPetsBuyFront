package com.pets.web.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontUtils {
	public static void showError(HttpServletRequest req, HttpServletResponse resp, String errorMsg)
			throws ServletException, IOException {
		resp.setStatus(500);
		req.setAttribute("errorMsg", errorMsg);
		req.getRequestDispatcher("/WEB-INF/error.jsp").forward(req, resp);
	}
}
