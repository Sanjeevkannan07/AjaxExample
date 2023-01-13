package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/city")


public class CityServlet extends HttpServlet{
      public void doGet(HttpServletRequest req,HttpServletResponse res) {
    	  String d = req.getParameter("district");
    	  DatabaseAdapter obj  = new DatabaseAdapter();
    	  ArrayList<String> cities = obj.DBRequest(d);
    	  req.setAttribute("city", cities);
    	  for(String city : cities) {
    		  try {
				res.getWriter().print(city+", ");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
    	  }
    	  
      }
}
