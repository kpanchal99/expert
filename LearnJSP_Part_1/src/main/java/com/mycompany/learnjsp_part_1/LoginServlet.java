/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.learnjsp_part_1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String btn = request.getParameter("btn");
        String search = request.getParameter("search");

        if ("redirect".equals(btn)) {
            // Redirect to Google search
            response.sendRedirect("https://www.google.com/search?q=" + search);
        } else if ("include".equals(btn)) {
            // Include content from index.html
            System.out.println("include------------------------ call");
            RequestDispatcher rd = request.getRequestDispatcher("/index.html");
            rd.include(request, response);
        } else {
            // Forward to welcome.jsp
            System.out.println("forward------------------------ call");
            RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String btn = request.getParameter("btn");
        String search = request.getParameter("search");

        if ("redirect".equals(btn)) {
            // Redirect to Google search
            response.sendRedirect("https://www.google.com/search?q=" + search);
        } else if ("include".equals(btn)) {
            // Include content from index.html
            System.out.println("include------------------------ call");
            RequestDispatcher rd = request.getRequestDispatcher("/index.html");
            rd.include(request, response);
        } else {
            // Forward to welcome.jsp
            System.out.println("forward------------------------ call");
            RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
