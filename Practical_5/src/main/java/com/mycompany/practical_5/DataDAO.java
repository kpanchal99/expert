/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author kpanchal
 */
public class DataDAO {
    
    public ResultSet getALLUsers(){
    
            try {
            // Register Driver 
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            System.out.println("Connecting to database...");
            Connection connection = DriverManager.getConnection(url, username, password);

            // Step 3: Execute a query
            System.out.println("Creating statement...");
            Statement statement = connection.createStatement();
            
            int id = Integer.parseInt(request.getParameter("id"));
            String username = request.getParameter("username");
            String email = request.getParameter("email");

            String inssql = "isnert into users (id, name, email) values ('"+ username+"', name, email )";
            ResultSet rs = statement.executeQuery(inssql);

            // Step 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");

                // Display values
//                System.out.print("id: " + id);
//                System.out.print(", username: " + name);
//                System.out.println(", email: " + email);
            }

            // Step 5: Clean-up environment
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        
        }    
        
         return rs; 
    }
}
