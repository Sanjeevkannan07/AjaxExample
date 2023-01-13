package com.example;

import java.sql.*;
import java.util.ArrayList;

import com.cedarsoftware.util.io.JsonWriter;



public class DatabaseAdapter {
	
     public String DBConnect() {
    	 ArrayList<String> districts = new ArrayList<String>();
     	
         try {
        	 
        	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","sanjeevkannan","Sanjeev2004!");	
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select distinct(District) from city");
			while(rs.next()) {
				districts.add(rs.getString(1));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        String[] temp = new String[districts.size()]; 
        temp = districts.toArray(temp);
        String states = JsonWriter.objectToJson(temp);
        return states; 
     }
     public ArrayList<String> DBRequest(String district) {
    	 ArrayList<String> cities = new ArrayList<String>();
      	
         try {
        	 
        	Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","sanjeevkannan","Sanjeev2004!");	
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select Name from city where District= '"+ district + "'");
			while(rs.next()) {
				cities.add(rs.getString(1));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
         return cities;
     }
}
