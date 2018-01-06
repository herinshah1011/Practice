package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BrowserHeaderController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String useragent = request.getHeader("user-agent");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		if(useragent.contains("Firefox"))
			out.println("<h1 align=\"center\">Mozilla FireFox Browser</h1>");
	
		if(useragent.contains("Chrome"))
			out.println("<h1 align=\"center\">Google Chrome Browser</h1>");
		
		if(useragent.contains("Edge") && useragent.contains("Chrome") && useragent.contains("Safari"))
			out.println(useragent);
			out.println("<h1 align=\"center\">Microsoft Edge Browser</h1>");
	
		out.println("</body>");
		out.println("</html>");
	
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}
	

}
