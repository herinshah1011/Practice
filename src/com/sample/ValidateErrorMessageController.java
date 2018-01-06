package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValidateErrorMessageController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out =response.getWriter();
		String Username = request.getParameter("userName");
		String Password = request.getParameter("passWord");
		session.setAttribute("Username", Username);
		session.setAttribute("Password", Password);
		response.setContentType("text/html");
		boolean error = false;
		
		if(Username == null)
		{
			error = true;
			request.setAttribute("UsernameError","Please Enter Username" );
		}
		
		if(Password == null)
		{
			error = true;
			request.setAttribute("PasswordError","Please Enter Password" );
		}
		
		if(error)
		{
			out.println("Welcome " +Username);
			out.println("<br><br><br><br><a href = \"LogoutErrorMessageController\">Logout</a>");	
		}
		
		else
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("/LoginErrorMessage.jsp");
			rd.forward(request, response);
			
		}
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
