/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.learnjsp_part_1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kpanchal
 */
public class SessionIn extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // getting value send by user using jsp form
        String cookie_value = request.getParameter("cookie_value");
        String http_value = request.getParameter("http_value");
        
        // set http session
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("username", http_value);
        
        
        // set Cookie
        Cookie cookie = new Cookie("year", cookie_value);
        response.addCookie(cookie);
        
        // setting value for hidden field
        request.setAttribute("sessionId", "435345v3");
        response.sendRedirect("SessionIn.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
