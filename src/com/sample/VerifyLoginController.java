package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class VerifyLoginController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	    String UserName = (String) session.getAttribute("UserName");
	    String PassWord = (String) session.getAttribute("PassWord");
	    PrintWriter out = response.getWriter();
	    
	      
	   if(UserName !=null || PassWord != null){
	    if (UserName.equals("admin") && PassWord.equals("admin")) {
			
			
			out.println("You Are Logged in "+UserName);
			response.setContentType("text/html");
		    out.println("<br><br><br><br>");
		    out.println("<a href = \"LogoutController\">LOGOUT</a>");
	    }
	   }
	    else{
	    		out.println("You Are Not Logged in ");
	    		response.setContentType("text/html");
	    		out.println("<br><br>");
	    		out.println("<a href = \"/LoginPage.html\">Login</a>");
	   }
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}

}
