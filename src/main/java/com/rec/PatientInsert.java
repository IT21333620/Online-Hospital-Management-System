package com.rec;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PatientInsert
 */
@WebServlet("/PatientInsert")
public class PatientInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String patientName = request.getParameter("name");
		String nic = request.getParameter("nic");
		String contact = request.getParameter("contact");
		String age = request.getParameter("age");
		String medicalUnit = request.getParameter("medicalUnit");
		String date = request.getParameter("date");
		String wardId = request.getParameter("wardId");
		
		boolean isTrue;
		
		isTrue = RecDBUtil.insertPatient(patientName, nic, contact, age, medicalUnit, date, wardId);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("insertsuccess.jsp");
			dis.forward(request, response);
		}
		
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("insertunsuccess.jsp");
			dis2.forward(request, response);
			
		}
		
			}

}
