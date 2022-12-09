package com.rec;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecLoginServlet
 */
@WebServlet("/RecLoginServlet")
public class RecLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String username = request.getParameter("uname"); // catching data
	String password = request.getParameter("password");
	
	
	try {
	List<Receptionist> recDetails = RecDBUtil.validate(username, password); //pass to the DBUtil from the jsp
	request.setAttribute("recDetails", recDetails);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	//navigate to 
	RequestDispatcher dis = request.getRequestDispatcher("pProfile.jsp");
	dis.forward(request, response);
		
	}

	
}
