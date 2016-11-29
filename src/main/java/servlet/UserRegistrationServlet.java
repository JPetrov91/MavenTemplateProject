package servlet;

import database.DBException;
import database.UserDAO;
import database.jdbc.UserDAOImpl;
import domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by User on 2016.11.29..
 */
@WebServlet(name = "UserRegistrationServlet")
public class UserRegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDAO userDAO = new UserDAOImpl();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        User user = new User();
        user.setLogin(request.getParameter("user_login"));
        user.setPassword(request.getParameter("user_password"));
        user.setFirstName(request.getParameter("user_firstname"));
        user.setLastName(request.getParameter("user_lastname"));
        user.setEmail(request.getParameter("user_email"));
        try {
            userDAO.create(user);
            out.print("Register is succesful");
        } catch (DBException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
