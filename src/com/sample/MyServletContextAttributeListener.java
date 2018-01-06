package com.sample;

import java.awt.Event;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {

	
	public void attributeAdded(ServletContextAttributeEvent Event) {
		System.out.println("Added attribute: " + Event.getName() + " was added with value: " + Event.getValue());
			
	}

	
	public void attributeRemoved(ServletContextAttributeEvent Event) {
		System.out.println("************************");
		System.out.println("Removed attribute: " + Event.getName() + " was added with value: " + Event.getValue());
		System.out.println("************************");
			}

	
	public void attributeReplaced(ServletContextAttributeEvent Event) {
		System.out.println("Replaced attribute: " + Event.getName() + " was added with value: " + Event.getValue());
	}

}
