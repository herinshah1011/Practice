package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCookieController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String UserName = (String) request.getParameter("userName");
		String PassWord = (String) request.getParameter("passWord");
		
		if (UserName.equals("admin") && PassWord.equals("admin")) {
			
			out.println("Welcome "+UserName);
			Cookie ck = new Cookie("User", UserName);
			response.addCookie(ck);
			
			out.println("<br><br><br><br>");
			out.println("<a href = \"LogoutCookieController\">Logout</a>");
			
		}
		
		else{
			out.println("Enter Correct Credentials");
			out.println("<br><br><br><br>");
			out.println("<a href = \"LoginCookie.html\">Login</a>");
		
		
		}
		
		
	}

}
