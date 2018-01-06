package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFormController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Welcome</title>");
		out.println("</head>");
		out.println("<title>Login Form</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action=\"LoginController\" method=\"post\">");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>UserName</td>");
		out.println("<td><input type=\"text\" name=\"userName\"></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Password</td>");
		out.println("<td><input type=\"password\" name=\"passWord\"></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Select City</td>");
		out.println("<td><select name=\"Select City\">");
		out.println("<option>--Select City--</option>");
		out.println("<option id=\"Ahmedabad\">Ahmedabad</option>");
		out.println("<option id=\"Surat\">Surat</option>");
		out.println("<option id=\"Vadodara\">Vadodara</option>");
		out.println("</select></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Select Hobbies</td>");
		out.println("<td><select name=\"Select Hobbies\" multiple=\"multiple\">");
		out.println("<option>--Select Hobbies--</option>");
		out.println("<option id=\"Games\">Games</option>");
		out.println("<option id=\"Music\">Music</option>");
		out.println("<option id=\"Movies\">Movies</option>");
		out.println("<option id=\"TVSeries\">TVSeries</option>");
		out.println("</select></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Gender</td>");
		out.println("<td>");
		out.println("<input type=\"radio\" name=\"gender\" id=\"Male\" value=\"Male\">Male");
		out.println("<input type=\"radio\" name=\"gender\" id=\"Female\" value=\"Female\">Female");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Games</td>");
		out.println("<td>");
		out.println("<input type=\"checkbox\" name=\"games\" value=\"Cricket\">Cricket");
		out.println("<input type=\"checkbox\" name=\"games\" value=\"Football\">Football");
		out.println("<input type=\"checkbox\" name=\"games\" value=\"Volleyball\">Volleyball");
		out.println("<input type=\"checkbox\" name=\"games\" value=\"Basketball\">Basketball");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Address</td>");
		out.println("<td><textarea rows=\"3\" cols=\"50\" name=\"address\"></textarea></td>");
		out.println("<tr>");
		out.println("<td><input type=\"submit\"></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}
