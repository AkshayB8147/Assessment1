package com.assessment.allsevlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.app.EmpApp;
import com.assessment.app.EmpDb;

@WebServlet("/FindEmployee")
public class FindEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empId=Integer.parseInt(request.getParameter("empId"));
		
		PrintWriter out=response.getWriter();
		EmpApp app=new EmpApp();
		out.write(app.findEmpById(empId));
		
		
	}

}
