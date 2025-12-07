package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt( req.getParameter("num1"));
		int j = Integer.parseInt( req.getParameter("num2"));
		
		
		 PrintWriter pw =  res.getWriter();
		// pw.print("Result is: " + (i+j));

		//.RequestDispatcher
		// req.setAttribute("num", i+j);
		// RequestDispatcher rd = req.getRequestDispatcher("sq");
		// rd.forward(req, res);

		//.SendRedirect
		// res.sendRedirect("sq?k="+(i+j)); //. URL Rewriting
		
		//.SessionManagement with SendRedirect
		// HttpSession session = req.getSession();
		// session.setAttribute("num", i+j);
		// res.sendRedirect("sq");
		
		//.Cookie
		 Cookie cookie = new Cookie("num", (i+j)+"");
		 res.addCookie(cookie);
		 res.sendRedirect("sq");
		
	}
}
