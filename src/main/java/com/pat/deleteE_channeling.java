package com.pat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteE_channeling")
public class deleteE_channeling extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int eid = Patient.getEid();
		boolean isTrue;
		
		isTrue = cusDBUtil.deleteE_channel(eid);
		
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Successfully Deleted');");
			out.println("location='home.jsp'");
			out.println("</script>");
		}
		
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("insertunsuccess.jsp");
			dis2.forward(request, response);
			
		}
	}

}
