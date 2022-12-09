package com.pat;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EchannelingTimeServlet")
public class EchannelingTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String time = request.getParameter("time");
		String who = request.getParameter("user");
		String note = request.getParameter("note");

		int eid = Patient.getEid();
		
		boolean istrue;
		
		
		System.out.println(eid+"echTime");
		istrue = cusDBUtil.AddEchannelTimeServlet(eid,time, who, note);
		
		try {
			List<E_channel> channelDeatil = cusDBUtil.getE_channel(eid);
			request.setAttribute("channelDetail", channelDeatil);
			
			String name = Staff_member.getname();
			List<Doctor> DocDetail = cusDBUtil.getDoctor(name);
			request.setAttribute("DocDetail", DocDetail);
		}
		catch(Exception e) {
			System.out.println("Database connection error..");
			 e.printStackTrace();
		}
		if(istrue == true) {
			
			
			RequestDispatcher dis = request.getRequestDispatcher("payment.jsp");
			dis.forward(request, response);
		}
		
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("insertunsuccess.jsp");
			dis2.forward(request, response);
			
		}
		
	}

}
