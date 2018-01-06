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

public class WelcomeController extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName = request.getParameter("userName");
		String PassWord = request.getParameter("passWord");
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();		
		session.setAttribute("UserName", UserName);
		session.setAttribute("PassWord", PassWord);
		
		
		if(UserName != null || PassWord != null){
		if (UserName.equals("admin") && PassWord.equals("admin")) {
			

			out.println("Welcome "+UserName);
			long lasttime = session.getLastAccessedTime();
			long Entertime = session.getCreationTime();
			response.setContentType("text/html");
			session.setAttribute("LoginTime",lasttime);
			session.setAttribute("LoginTime",Entertime);
			out.println("<br><br><br><br>");
			out.println("<a href = \"LogoutController\">LOGOUT</a>");
			
					
		}
		}
	    else{
	    	
	    	out.println("Enter Correct Credentials");
	    	response.setContentType("text/html");
	    	out.println("<br><br><br><br>");
			out.println("<a href = \"LoginPage.html\">LOGIN</a>");
	    
	    }
		
		
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
