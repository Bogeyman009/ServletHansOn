package com.Welcome;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Servlet implementation class IdValidate
 */
public class IdValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String id =request.getParameter("id");
		
		String values[]= {"1001","1002","1003","1004","1005"};
		List<String> list=Arrays.asList(values);
		if(list.contains(id)) {
			response.sendRedirect("welcome.html");
		}
		else
		{
			pw.println("Your Id is not in the list");
			RequestDispatcher dis=request.getRequestDispatcher("Index.html");
			dis.include(request, response);
		}
	}

}
