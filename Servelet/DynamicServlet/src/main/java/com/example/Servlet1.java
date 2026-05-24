package com.example;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
// multiple servlets are created to establish a communication container with in the server.
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    System.out.println("control in the First servlet");
        String  name = req.getParameter("uname");
        String  city = req.getParameter("ucity");
        String  password = req.getParameter("upass");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Servlet2");
        // we have two methods in requestDispatch that are
        // forward  will give response of second servlet or end servlet
        // include will give responses from first and end Servlet...
        // requestDispatcher.forward(req,resp);
        
        // there is a method called session which is used to pass the data between multiple Servlet
        HttpSession session = req.getSession();
        session.setAttribute("name",name);
        session.setAttribute("city",city);
        session.setAttribute("password",password);
        requestDispatcher.include(req,resp);
        PrintWriter writer = resp.getWriter();
        writer.println("<h1> Hello this is first servlet! <h1>");
        writer.close();
//        System.out.println("Control agin in first server!");
    }
}