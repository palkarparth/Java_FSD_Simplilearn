package com.simplilearn.servletinterface;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InterfaceDemo
 */
@WebServlet("/InterfaceDemo")
public class InterfaceDemo implements Servlet {
	
	ServletConfig config = null;
	
    public InterfaceDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("In destroy() method");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		return config;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		return "This is a sample servlet info"; 
	}


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("index.html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("In the service() method<br>");
		out.println("</body>");
		out.println("</html>");
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Initialization complete");
		
	}

}
