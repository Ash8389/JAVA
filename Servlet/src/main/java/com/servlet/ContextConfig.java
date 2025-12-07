package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ContextConfig extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		//.Servlet Context
		// ServletContext ctx = getServletContext();
		// String name = ctx.getInitParameter("name");
		
		ServletConfig cfg = getServletConfig();
		String name = cfg.getInitParameter("name"); 
		
		PrintWriter pw = res.getWriter();
		pw.println("My name is: " + name);
	}
}
