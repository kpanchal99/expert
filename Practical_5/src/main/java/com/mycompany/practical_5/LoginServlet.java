/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.practical_5;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kpanchal
 */
public class LoginServlet extends HttpServlet {

    String db_name = "mca";
    String url = "jdbc:mysql://localhost:3306/" + db_name;
    int PORT = 3306;
    String username = "root";
    String password = "root";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
            String sql = "SELECT id, name, email FROM users";
            ResultSet rs = statement.executeQuery(sql);

            // Step 4: Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                // Display values
                System.out.print("id: " + id);
                System.out.print(", username: " + name);
                System.out.println(", email: " + email);
            }

            // Step 5: Clean-up environment
            rs.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        
        }    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
