
package com.mycompany.practical_3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionOut extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //http session
        HttpSession hs = request.getSession();
        String subject = (String)hs.getAttribute("subject");
        String year = (String)hs.getAttribute("year");
        
        //cookies
        Cookie[] cookies = request.getCookies();
        String cookieName = cookies[0].getName();
        String cookieValue= cookies[0].getValue();

        //url Rewrite
        String param1 = request.getParameter("uname");



        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SessionOut</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SessionOut at : " + request.getContextPath() + "</h1>");
            out.println("<h1>Servlet SessionOut Subject :" + subject + "</h1>");
            out.println("<h1>Servlet SessionOut Year : " + year+ "</h1><hr>");
            out.println("<h1>Servlet Cookies Name : " + cookieName+ "</h1>");
            out.println("<h1>Servlet Cookies Name : " + cookieValue+ "</h1><hr>");
            out.println("<h1>Servlet Url value : " + param1+ "</h1>");                       
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
