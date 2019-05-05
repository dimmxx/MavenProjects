package servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxTestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String productName = req.getParameter("productName");

        req.setAttribute("productName", productName);

        RequestDispatcher rd = req.getRequestDispatcher("./WEB-INF/view/ajaxTest.jsp");
        rd.forward(req, resp);





    }
}
