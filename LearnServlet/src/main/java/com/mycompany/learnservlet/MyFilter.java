
package com.mycompany.learnservlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class MyFilter implements Filter {

    private String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization logic, can access init-params
        encoding = filterConfig.getInitParameter("encoding");
        
        System.out.println(" MyFilter INIT ");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // Pre-processing logic before invoking the servlet or next filter
        request.setCharacterEncoding(encoding);

        // Pass the request along the filter chain
        chain.doFilter(request, response);
        System.out.println(" MyFilter doFILTER ");

        // Post-processing logic after the servlet or last filter has been invoked
    }

    @Override
    public void destroy() {
        // Cleanup resources, if any
        System.out.println(" MyFilter DESTROY ");

    }
}