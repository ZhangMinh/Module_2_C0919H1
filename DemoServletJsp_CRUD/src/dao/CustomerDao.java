package dao;

import model.Customer;

import java.util.*;

public class CustomerDao {
    private static final Map<Integer, Customer> listCUSTOMER = new HashMap<Integer, Customer> ();

    static {
        initCustomers ();
    }

    private static void initCustomers() {
        Customer cus1 = new Customer ( 1, "Truong Minh", "0911247359", "ngocminh.qnm@vnpt.vn" );
        Customer cus2 = new Customer ( 2, "Truong Binh", "0911247358", "ngocbinh.qnm@vnpt.vn" );
        Customer cus3 = new Customer ( 3, "Truong Loi", "0911247357", "ngocloi.qnm@vnpt.vn" );
        Customer cus4 = new Customer ( 4, "Truong Hoan", "0911247357", "ngochoan.qnm@vnpt.vn" );

        listCUSTOMER.put ( cus1.getId (), cus1 );
        listCUSTOMER.put ( cus2.getId (), cus2 );
        listCUSTOMER.put ( cus3.getId (), cus3 );
        listCUSTOMER.put ( cus4.getId (), cus4 );
    }

    //Viết phương thức xử lý get thông tin chi tiết của 1 customer theo id
    public static Customer getCustomer(int customerId) {
        return listCUSTOMER.get ( customerId );
    }

    //Viết phương thức thêm mới một customer vào danh sách
    public static void addCustomer(Customer customer) {
        listCUSTOMER.put ( customer.getId (), customer );
    }

    //Viết phương thức update thông tin 1 customer
    public static Customer updateAndCreatCustomer(Customer customer) {
        listCUSTOMER.put ( customer.getId (), customer );
        return customer;
    }

    //Viết phương thức delete 1 customer theo id
    public static void deleteCustomer(int customerId) {
        listCUSTOMER.remove ( customerId );
    }

    //Viết phương thức lấy danh sách tất cả các Customer
    public static List<Customer> getAllCustomer() {
        Collection<Customer> c = listCUSTOMER.values ();
        List<Customer> list = new ArrayList<Customer> ();
        list.addAll ( c );
        return list;
    }
}
