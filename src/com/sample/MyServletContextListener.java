package com.sample;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	
	public void contextInitialized(ServletContextEvent Event) {
	
		System.out.println("************************");
		System.out.println("************************");
		System.out.println("In Init ServletContextListener");
		System.out.println("************************");
		System.out.println("************************");
		ServletContext application = Event.getServletContext();
		application.setAttribute("Dog","Animal");
		
	}
	
	
	public void contextDestroyed(ServletContextEvent Event) {
	
		System.out.println("************************");
		System.out.println("************************");
		System.out.println("In Destroy ServletContextListener");
		System.out.println("************************");
		System.out.println("************************");
	}

	

}
