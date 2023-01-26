package kz.bitlab.javaee.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kz.bitlab.javaee.db.DBManager;
import kz.bitlab.javaee.db.Item;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/homepage")
public class HomePageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Item> items = DBManager.getAllItems();
        request.setAttribute("items", items);

        request.getRequestDispatcher("homepage.jsp").forward(request,response);
    }
}
