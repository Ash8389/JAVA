package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		//. For RequestDispatcher
		// int num = (int) req.getAttribute("num");

		//. For SendRedirect
		int num = Integer.parseInt(req.getParameter("k"));
//		
		PrintWriter pw = res.getWriter();
		pw.print("Square of a number: " + num*num);
	}
}
