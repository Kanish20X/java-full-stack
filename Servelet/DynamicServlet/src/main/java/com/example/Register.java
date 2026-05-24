package com.example;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/regi")
public class Register extends HttpServlet {

    public Register(){
        System.out.println("A Servlet object is created internally by web container");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet in control / controller");
        String  name = request.getParameter("uname");
        String  password = request.getParameter("upass");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        if(name.equals("Medicharla k satya Phanindra") && password.equals("Satya123")){
            out.println("<html>");
            out.println("<body style='background-color: black; color: white; text-align: center; margin-top: 15%;'>");
            out.println("<h1>Registration Successful!</h1>");
            out.println("<p>Welcome, <strong>" + name + "</strong>.</p>");
            out.println("<p>Your account has been created successfully.</p>");
            out.println("</body>");
        } else  {

            out.println("<body style='background-color: black; color: white; text-align: center; margin-top: 15%;'>");
            out.println("<h1>Registration failed!</h1>");
            out.println("<h1> Invalid username /Password  : <Strong> " + name + "</strong> , *****.." );
            out.println("</body>");
        }


    }

//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String  name = request.getParameter("uname");
       String  city = request.getParameter("ucity");
       String  password = request.getParameter("upass");
// if we want to send a dynamic response from the servlet we use getWriter method from a PrintWriter class
        PrintWriter out = response.getWriter();
        response.sendRedirect("/DynamicServlet/RegisterSuccess.jsp");
//        response.setContentType("text/html");
//        out.println("<html>");
//        out.println("<body style='background-color: black; color: white; text-align: center; margin-top: 15%;'>");
//        out.println("<h1>Registration Successful!</h1>");
//        out.println("<p>Welcome, <strong>" + name + "</strong> from " + city + ".</p>");
//        out.println("<p>Your account has been created successfully.</p>");
//        out.println("</body>");
//        //        doGet(request, response);
//
  }
}
//steps load and initialization
//init() - method for initializing the data
// service methods are called multiple times based on the request
// destroy method is called internally t0 shut down the servlet instance or container created in server
