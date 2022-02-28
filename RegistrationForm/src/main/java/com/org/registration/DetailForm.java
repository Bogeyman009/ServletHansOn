package com.org.registration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DetailForm
 */
public class DetailForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
		
		String fName=request.getParameter("fname");
		String lName=request.getParameter("lname");
		String ages=request.getParameter("age");
		String uId=request.getParameter("id");
		String pass=request.getParameter("pass");
		int age=Integer.parseInt(ages);
//		if(pass.length()>=8 && age >18) {
//			RequestDispatcher dis=	request.getRequestDispatcher("welcome");
//			dis.forward(request, response);
//		}
//		else
//		{
//			pw.println("Try Again wrong credentials");
//			RequestDispatcher dis=request.getRequestDispatcher("Index.html");
//			dis.include(request, response);
		if(pass.length()>=8 && age >18) {
			pw.println("<h3> FirstName :  "+fName+"</h3><br>");
			pw.println("<h3> LastName :  "+lName+"</h3><br>");
			pw.println("<h3> Age :  "+age+"</h3><br>");
			
		}
		else
		{
			pw.println("Try Again wrong credentials");
			RequestDispatcher dis=request.getRequestDispatcher("Index.html");
			dis.include(request, response);
		}
	}

}
