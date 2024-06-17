
package com.mycompany.practical_2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class GenericServletExample extends GenericServlet {

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        sr1.setContentType("text/html");
        PrintWriter out = sr1.getWriter();
        out.println("<html><body>");
        out.println("<h2>Response from GenericServlet</h2>");
        out.println("Hello, this is a generic servlet example!");
        out.println("</body></html>");   
    }
}
