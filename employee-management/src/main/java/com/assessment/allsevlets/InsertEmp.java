package com.assessment.allsevlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.app.Emp;
import com.assessment.app.EmpDb;
import com.assessment.exceptions.EmpNotFoundException;

@WebServlet("/InsertEmp")
public class InsertEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empId=Integer.parseInt(request.getParameter("empId"));
		String empName=request.getParameter("empName");
		String empCity=request.getParameter("empCity");
		double empSal=Double.parseDouble(request.getParameter("empSal"));
		
		EmpDb.db.put(empId, new Emp(empId,empName,empCity,empSal));
	}
}
