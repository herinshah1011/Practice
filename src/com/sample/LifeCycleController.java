package com.sample;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleController extends HttpServlet{

	public LifeCycleController(){
		
		System.out.println("Default Constructor......");
	}
	
	public void init() throws ServletException {
		System.out.println("INIT Called......");
	}
	
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
	System.out.println("Service Called......");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DoPost Called......");
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DoGet Called......");
	}
	
	
	
	public void destroy() {
		System.out.println("***********************");
		System.out.println("***********************");		
		System.out.println("***********************");
		System.out.println("Destroy Called......");
		System.out.println("***********************");
		System.out.println("***********************");		
		System.out.println("***********************");
		
	}
	
}
