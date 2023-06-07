package com.fc.clientside.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class storesServlet
 */
@WebServlet("/storesServlet")
public class storesServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BufferedReader reader = request.getReader();
		
		System.out.println("From Reader :"+reader);
		
//		StringBuilder builder=new StringBuilder();
//		
//		String line;
//		
//		while((line=reader.readLine())!=null) {
//			System.out.println("Line" +line);
//			builder.append(line);
//		}
//		
		System.out.println("THE DATA "+reader.readLine());
		
		response.setContentType("application/json");	
		
		PrintWriter writer = response.getWriter();
		
		writer.write("{\"result\": \"Stored Successfully\"}");
		
		
	}

}
