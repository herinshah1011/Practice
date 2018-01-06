package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerifyLoginCookieController extends HttpServlet{

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		Cookie ck[] = request.getCookies();
		PrintWriter out =response.getWriter();
		if (ck!=null) {
				String User = ck[0].getValue();
				
				if (User.equals("")||User!=null) {
			
					out.println("Welcome "+User);
			
				}
		}
		else {
			out.println("Login First");
			
			out.println("<br><a href =\"LoginCookie.html\">Login</a>");
		}
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
