package com.pat;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rec.RecDBUtil;

/**
 * Servlet implementation class EchannelingServlet
 */
@WebServlet("/EchannelingServlet")
public class EchannelingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("Type");
		String doc = request.getParameter("doc");
		String date = request.getParameter("dat");
		int pid = Patient.getPID();
		
		
		
		
		boolean isTrue;
		int eid = cusDBUtil.findeid();
		eid += 1;
		Patient.setEid(eid);
		System.out.println(eid+"ech");
		isTrue = cusDBUtil.AddEchannelServlet(eid,pid,type,doc,date);
		
		if(isTrue == true) {
			
			try {
				List<Doctor> DocDetail = cusDBUtil.getDoctor(doc);
				request.setAttribute("DocDetail", DocDetail);
			}
			catch(Exception e) {
				System.out.println("Database connection error..");
				 e.printStackTrace();
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("E-channelingTime.jsp");
			dis.forward(request, response);
		}
		
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("insertunsuccess.jsp");
			dis2.forward(request, response);
			
		}
	}
}
