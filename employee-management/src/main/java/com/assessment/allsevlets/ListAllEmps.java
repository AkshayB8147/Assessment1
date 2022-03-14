package com.assessment.allsevlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.app.EmpApp;

@WebServlet("/ListAllEmps")
public class ListAllEmps extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpApp empApp=new EmpApp();
		List<String> listEmps = empApp.listAll();

		PrintWriter out= response.getWriter();
		for(String list: listEmps) {
			out.write(list);
		}
	}
}

