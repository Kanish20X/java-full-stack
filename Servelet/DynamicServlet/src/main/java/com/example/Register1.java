package com.example;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/register1") // Best practice: keep the leading forward slash for standard URL path container matching
public class Register1 extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Servlet in control / controller");
        String user_name = req.getParameter("uname");
        String user_email = req.getParameter("uemail");
        String password = req.getParameter("upass");
        String city = req.getParameter("ucity");

        // Appending standard loopback network safety arguments for Tomcat 11 environments
        String url = "jdbc:mysql://127.0.0.1:3306/Student?useSSL=false&allowPublicKeyRetrieval=true";
        String username = "root";
        String pass = "Satya.k123!";

        String sql_query = "INSERT INTO userInfo(uname, uemail, upass, ucity) VALUES(?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Auto-closes connection and statement blocks even if execution errors fire
            try (Connection connection = DriverManager.getConnection(url, username, pass);
                 PreparedStatement ps = connection.prepareStatement(sql_query)) {

                System.out.println("Connection successfully established!");
                ps.setString(1, user_name);
                ps.setString(2, user_email);
                ps.setString(3, password);
                ps.setString(4, city);

                int status = ps.executeUpdate();
                System.out.println("Database execution complete. Status: " + status);

                if (status != 0) {
                    RequestDispatcher dispatcher = req.getRequestDispatcher("RegisterSuccess.jsp");
                    dispatcher.forward(req, resp);
                } else {
                    resp.setContentType("text/html");
                    PrintWriter write = resp.getWriter(); // Opened SAFELY only on failure scenario
                    write.println("<h1>Failed to insert values!.</h1>");
                }
            }

        } catch (SQLException | ClassNotFoundException e) {
            resp.setContentType("text/html");
            try {
                PrintWriter out = resp.getWriter();
                out.println("<h2 style='color:red;'>Database Diagnostics Error Encountered:</h2>");
                out.println("<pre>");
                e.printStackTrace(out); // Prints full target stack trace right onto the webpage frame
                out.println("</pre>");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
