<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import ="java.sql.*" %>
<%
    try{
    	out.println("Connecting1...");
        String username = request.getParameter("username");   
        String password = request.getParameter("password");
        out.println(username+"  "+password);
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connection..");
		//step 2
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?",
				"root","123456789");
		System.out.println("Connection established");
		out.println("Connected");
        PreparedStatement pst = conn.prepareStatement("Select user,pass from login where user=? and pass=?");
        
        pst.setString(1, username);
        pst.setString(2, password);
        out.println(pst);
        ResultSet rs = pst.executeQuery();                        
        if(rs.next())           
           out.println("Valid login credentials");        
        else
           out.println("Invalid login credentials");            
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again");
    	e.printStackTrace();
   }      
%>