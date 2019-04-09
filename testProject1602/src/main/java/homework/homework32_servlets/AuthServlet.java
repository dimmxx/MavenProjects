package homework.homework32_servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class AuthServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String pass = req.getParameter("pass");

        PrintWriter out = resp.getWriter();
        PostgresSQLDAO db = new PostgresSQLDAO();

        String role = db.authUser(login, pass);
        out.write(role);

//        if (role != null) {
//            out.write("You are logged in. Your role: " + role);
//        } else {
//            out.write("Wrong password");
//            //RequestDispatcher rd = req.getRequestDispatcher("loginForm.html");
//            //rd.forward(req, resp);
//        }
        db.close();
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        String login = req.getParameter("login");
//        String pass = req.getParameter("pass");
//        String repass = req.getParameter("repass");
//
//        PostgresSQLDAO db = new PostgresSQLDAO();
//        out.write("" + (pass.equals(repass)));
//        if (pass.equals(repass)) {
//            User user = new User(login, pass, "mary@hmail.com", "user");
//            db.addUser(user);
//            RequestDispatcher rd = req.getRequestDispatcher("loginForm.html");
//            rd.forward(req, resp);
//        }else{
//            out.write("Passwords do not match");
//        }
//
//        db.close();
//    }
}
