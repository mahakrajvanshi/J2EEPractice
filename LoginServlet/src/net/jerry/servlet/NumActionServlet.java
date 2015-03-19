package net.jerry.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NumActionServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		String but = req.getParameter("butt");
		if(but.equals("add")){
			resp.getWriter().println(num1+num2); //will go to a blank notepad, and print answer
		
		}else if(but.equals("minus")){
			resp.getWriter().println(num1-num2);
		
		}else if(but.equals("showAdd")){
			req.setAttribute("result", num1 + num2);
			req.getRequestDispatcher("main.jsp").forward(req, resp); //show the result in the same page
		}
	}
}
