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


@WebServlet("/paymentServlet")
public class paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String options = request.getParameter("options");
		String card = request.getParameter("card");
		String date = request.getParameter("exp");
		String cvv = request.getParameter("cvv");
		int pid = Patient.getPID();
		int eid = cusDBUtil.findeid();
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		boolean isTrue;
		
		isTrue = cusDBUtil.Addpayment(pid,eid,options,card,date,cvv);
		
		
		if(isTrue == true) {
			
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Payment successful');");
			out.println("location='home.jsp'");
			out.println("</script>");

		}
		
		else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Payment Unsuccessful');");
			out.println("location='payment.jsp'");
			out.println("</script>");
			
		}
	}

}
