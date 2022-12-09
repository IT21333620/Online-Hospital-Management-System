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


@WebServlet("/updateE_channeling")
public class updateE_channeling extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String Type = request.getParameter("ty");
		String Doc = request.getParameter("doc");
		String Date = request.getParameter("datee");
		String Time = request.getParameter("timee");
		
		

		int eid = Patient.getEid();
		
		boolean istrue;
		
		
		System.out.println(eid+"echTime");
		istrue = cusDBUtil.updateE_channel(eid,Type,Doc,Date,Time);
		
		if(istrue == true) {
			
			try {
				List<E_channel> channelDeatil = cusDBUtil.getE_channel(eid);
				request.setAttribute("channelDetail", channelDeatil);
			}
			catch(Exception e) {
				System.out.println("Database connection error..");
				 e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("payment.jsp");
			dis.forward(request, response);
			System.out.println(Type);

		}
		
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("insertunsuccess.jsp");
			dis2.forward(request, response);
			
		}
	}

}
