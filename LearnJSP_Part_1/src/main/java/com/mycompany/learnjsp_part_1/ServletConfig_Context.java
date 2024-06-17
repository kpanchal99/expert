/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.learnjsp_part_1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kpanchal
 */
public class ServletConfig_Context extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        // values are defined in web.xml
        
        // Servelt Config - for each servlet
        ServletConfig servletConfig = getServletConfig();
        String jbdc_url =servletConfig.getInitParameter("jdbc_url");
        
        System.out.println(jbdc_url);
        
        // ServletContext - servlet Container
        ServletContext servletContext = getServletContext();
        String app_name = servletContext.getInitParameter("appName");
        System.out.println(app_name);
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               // values are defined in web.xml
        
        // Servelt Config - for each servlet
        ServletConfig servletConfig = getServletConfig();
        String jbdc_url =servletConfig.getInitParameter("jdbc_url");
        
        System.out.println(jbdc_url);
        
        // ServletContext - servlet Container
        ServletContext servletContext = getServletContext();
        String app_name = servletContext.getInitParameter("appName");
        System.out.println(app_name);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
