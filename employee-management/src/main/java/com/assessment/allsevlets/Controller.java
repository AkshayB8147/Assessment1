package com.assessment.allsevlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.app.Emp;
import com.assessment.app.EmpApp;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmpApp empApp;
	public void init() throws ServletException {
		empApp=new EmpApp();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		
			switch (action) {
			case "/findEmpById":
				RequestDispatcher rd1=request.getRequestDispatcher("findEmpById");
				rd1.forward(request, response);
				break;
			case "/insertEmp":
				RequestDispatcher rd2=request.getRequestDispatcher("createEmp");
				rd2.forward(request, response);
				break;
			case "/deleteEmp":
				RequestDispatcher rd3=request.getRequestDispatcher("deleteEmp");
				rd3.forward(request, response);
				break;
			case "/updateEmp":
				RequestDispatcher rd4=request.getRequestDispatcher("updateEmp");
				rd4.forward(request, response);;
				break;
			case "/listAll":
				RequestDispatcher rd5=request.getRequestDispatcher("listAll");
				rd5.forward(request, response);
				break;
			default:
				response.sendError(404);
				break;
			}
	}

}
