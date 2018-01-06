package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int i;
		String UserName = request.getParameter("userName");
		String Password = request.getParameter("passWord");
		String SelectCity = request.getParameter("Select City");
		String[] SelectHobbies = request.getParameterValues("Select Hobbies");
		String Gender = request.getParameter("gender");
		String[] Games = request.getParameterValues("games");
		String address = request.getParameter("address");
		
		System.out.println("Username : "+UserName);
		
		System.out.println("Password : "+Password);
		
		System.out.println("City : "+SelectCity);
			
		System.out.println("Hobbies : ");
		for(i=0;i<SelectHobbies.length;i++)
		{	
			System.out.println(SelectHobbies[i]);
		
		}
		
		System.out.println("Gender : "+Gender);
		
		System.out.println("Games :");
		for(i=0;i<Games.length;i++)
		{	
			System.out.println(Games[i]);
		
		}
		
		System.out.println("Address : "+address);
		
		// Printing On Console
		
		PrintWriter out = response.getWriter();
		
		out.println("Username : "+UserName);
		
		out.println("Password : "+Password);
		
		out.println("City : "+SelectCity);
			
		out.println("Hobbies : ");
		for(i=0;i<SelectHobbies.length;i++)
		{	
			out.println(SelectHobbies[i]);
		
		}
		
		out.println("Gender : "+Gender);
		
		out.println("Games :");
		for(i=0;i<Games.length;i++)
		{	
			out.println(Games[i]);
		
		}
		
		out.println("Address : "+address);
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	

}
