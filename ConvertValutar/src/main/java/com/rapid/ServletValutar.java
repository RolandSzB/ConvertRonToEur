package com.rapid;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletValutar extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String ron = req.getParameter("ron");
		String euro = req.getParameter("EURO");
		
		double ronInt = Double.parseDouble(ron);
        double euroInt = Double.parseDouble(euro);

		double convertedValue = ronInt*euroInt;
		
		req.setAttribute("ronValue", ron);
		req.setAttribute("value", convertedValue);

		
		req.getRequestDispatcher("convert.jsp").forward(req, res);
		
	}
}