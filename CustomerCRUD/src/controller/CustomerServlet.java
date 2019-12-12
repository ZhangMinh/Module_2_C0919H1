package controller;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "controller.customerServlet")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter ( "action" );
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "creat":
                break;
            case "edit":
                break;
            case "delete":
                break;
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter ( "action" );
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "creat":
                showCreateForm ( request, response );
                break;
            case "edit":
                break;
            case "delete":
                break;
            case "view":
                break;
            default:
                listCustomers ( request, response );
                break;
        }
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CustomerService customerService = new CustomerServiceImpl ();
        List<Customer> customers = new ArrayList<> ();
        customers = customerService.findall ();
        request.setAttribute ( "customers", customers );
        RequestDispatcher requestDispatcher = request.getRequestDispatcher ( "customer/index.jsp" );
        requestDispatcher.forward ( request, response );
    }


    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher ( "customer/create.jsp" );
        requestDispatcher.forward ( request,response );
    }
}
