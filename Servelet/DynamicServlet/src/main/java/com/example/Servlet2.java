package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter writer1 = resp.getWriter();

        // 1. Fetch the session safely
        HttpSession session = req.getSession(false);

        // 2. Check if the session actually exists
        if (session != null) {

            // 3. Use safe casting (String) instead of .toString()
            String name = (String) session.getAttribute("name");
            String city = (String) session.getAttribute("city");
            String pass = (String) session.getAttribute("password");

            // Double check that the data inside the session isn't empty
            if (name != null) {
                // Fixed the CSS "color" typo here
                writer1.println("<h1 style='text-align:center; margin-top:15%; background-color:black; color:white;'>");
                writer1.println("Hello, <strong>" + name + "</strong>. Welcome to the webpage from " + city + "!");
                writer1.println("</h1>");
            } else {
                writer1.println("<h2 style='text-align:center; color:red;'>Session exists, but user data is missing!</h2>");
            }

        } else {
            // 4. Gracefully handle unauthorized access or expired sessions
            writer1.println("<div style='text-align:center; margin-top:15%;'>");
            writer1.println("<h2 style='color:red;'>Session Expired or Invalid!</h2>");
            writer1.println("<p>Please go back and login/register first.</p>");
            writer1.println("<a href='index.html'>Go to Home Page</a>");
            writer1.println("</div>");
        }
    }
}