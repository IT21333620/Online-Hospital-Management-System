package com.pat;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/cusLoginServlet")
public class cusLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");

	String username = request.getParameter("uname"); // catching data
	String password = request.getParameter("password");
	boolean isTrue;

	
	try {
	
		isTrue = cusDBUtil.validate(username, password);

		
		
		if(isTrue == true) {
			
			List<Patient> recDetails = cusDBUtil.getPatient(username); //pass to the DBUtil from the jsp
			request.setAttribute("recDetails", recDetails);
			
			int pid = Patient.getPID();
			List<E_channel> channelDeatil = cusDBUtil.getE_channelAll(pid);
			request.setAttribute("channelDetail", channelDeatil);
			RequestDispatcher dis = request.getRequestDispatcher("pProfile.jsp");
			dis.forward(request, response);
			
		}
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Username or Password is incorrect');");
			out.println("location='pLogin.jsp'");
			out.println("</script>");

		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	//navigate to 
	
		
	}

	
}