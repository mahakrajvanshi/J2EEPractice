package net.jerry.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String username = (String) req.getParameter("username");
		String password = (String) req.getParameter("password");
		
		
		HttpSession session = req.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		
		
		Cookie usernameCookie = new Cookie("username", username);
		Cookie passCookie = new Cookie("password", password);
		resp.addCookie(usernameCookie);
		resp.addCookie(passCookie);
		
	
		/**
		 * to ways going to another view.
		 */
		resp.sendRedirect("main.jsp");
		
		//req.getRequestDispatcher("main.jsp").forward(req, resp);
	}

}
