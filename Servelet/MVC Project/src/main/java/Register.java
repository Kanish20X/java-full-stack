import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("/register")
public class Register extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Servlet in control / controller");
        String  user_name = req.getParameter("uname");
        String user_email = req.getParameter("uemail");
        String  password = req.getParameter("upass");
        String city = req.getParameter("ucity");

        Model obj = new Model();
        obj.setCity(city);
        obj.setName(user_name);
        obj.setUemail(user_email);
        obj.setUpass(password);
        int register = obj.register();
        HttpSession session = req.getSession();
        session.setAttribute("name",user_name);
        session.setAttribute("city",city);

        if(register!=0){
            resp.sendRedirect("success.jsp");
        }
        else{
            resp.sendRedirect("Failure.jsp");
        }

    }
}