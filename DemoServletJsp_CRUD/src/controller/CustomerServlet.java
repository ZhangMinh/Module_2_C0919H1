package controller;

import dao.CustomerDao;
import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

@WebServlet(name = "CustomerServlet", urlPatterns = "/")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath ();
        switch (action) {
            case "/create":
                createCustomer ( request, response );
                break;
            case "/update":
                updateCustomer ( request, response );
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getServletPath ();

        switch (action) {
            case "/new":
                showNewForm ( request, response );
                break;
            case "/delete":
                deleteCustomerById ( request, response );
                break;
            case "/edit":
                showEditForm ( request, response );
                break;
            default:
                // Mặc định tất cả các action sai ở trên đều sẽ trả về trang list
                listCustomer ( request, response );
                break;
        }
    }

    // Viết phương thức lấy dữ liệu và trả về trang list
    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> listCustomer = CustomerDao.getAllCustomer ();
        request.setAttribute ( "listCustomer", listCustomer );
        RequestDispatcher dispatcher = request.getRequestDispatcher ( "customer/index.jsp" );
        dispatcher.forward ( request, response );
        //hỏi lại đại ca trung khác nhau giữa dispatcher và redirect
    }

    //Viết phương thức Delele customer theo id
    private void deleteCustomerById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idCustomer = Integer.parseInt ( request.getParameter ( "id" ) );
        CustomerDao.deleteCustomer ( idCustomer );
        response.sendRedirect ( "/" );
    }

    //Viết phương thức hiển thị trang thêm mới Customer
    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher ( "customer/newCustomer.jsp" );
        dispatcher.forward ( request, response );
    }

    //Viết phương thức lưu customer vào data thông qua doPost
    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt ( request.getParameter ( "id" ) );
        Customer checkCustomer = CustomerDao.getCustomer ( id );
        if (checkCustomer == null) {
            String name = request.getParameter ( "name" );
            String phone = request.getParameter ( "phone" );
            String email = request.getParameter ( "email" );
            Customer newCustomer = new Customer ( id, name, phone, email );
            CustomerDao.addCustomer ( newCustomer );
            response.sendRedirect ( "/" );
        } else {
            String message = "This Id already exist!";
            String name = request.getParameter ( "name" );
            String phone = request.getParameter ( "phone" );
            String email = request.getParameter ( "email" );
            Customer existCustomer = new Customer ( id, name, phone, email );
            request.setAttribute ( "message", message );
            request.setAttribute ( "customer", existCustomer );
            RequestDispatcher dispatcher = request.getRequestDispatcher ( "customer/newCustomer.jsp" );
            dispatcher.forward ( request, response );
        }

    }

    //Viết phương thức hiển thị trang edit
    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt ( request.getParameter ( "id" ) );
        Customer customerEdit = CustomerDao.getCustomer ( id );
        request.setAttribute ( "customer", customerEdit );
        RequestDispatcher dispatcher = request.getRequestDispatcher ( "customer/editCustomer.jsp" );
        dispatcher.forward ( request, response );
    }

    //Viết phuơng thức update Customer
    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt ( request.getParameter ( "id" ) );
        String name = request.getParameter ( "name" );
        String phone = request.getParameter ( "phone" );
        String email = request.getParameter ( "email" );
        Customer updateCustomer = new Customer ( id, name, phone, email );
        CustomerDao.addCustomer ( updateCustomer );
        response.sendRedirect ( "/list" );

    }
}

