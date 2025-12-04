package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		//. For RequestDispatcher
		// int num = (int) req.getAttribute("num");

		//. For SendRedirect
		// int num = Integer.parseInt(req.getParameter("k"));
		
		//. For SessionManagement
		// HttpSession session = req.getSession();
		// int num = (int)session.getAttribute("num");

		// session.removeAttribute("num");
		
		Cookie cookies[] = req.getCookies();
		int num = 0;
		
		for(Cookie c: cookies) {
			if(c.getName().equals("num")) {
				num = Integer.parseInt(c.getValue());
				break;
			}
		}
		
		PrintWriter pw = res.getWriter();
		pw.print("Square of a number: " + num*num);
	}
}
