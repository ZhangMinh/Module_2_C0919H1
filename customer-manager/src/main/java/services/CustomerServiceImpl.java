package services;

import models.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer,Customer> customers;
    static {
        customers=new HashMap<> (  );
        customers.put ( 1,new Customer ( 1,"Minh","minh@codegym.vn","Quang Nam" ) );
        customers.put ( 2,new Customer ( 2,"Trieu","trieu@codegym.vn","Quang Ngai" ) );
        customers.put ( 3,new Customer ( 3,"Linh","linh@codegym.vn","Quang Tri" ) );
        customers.put ( 4,new Customer ( 4,"Duy","duy@codegym.vn","Hue" ) );

    }
    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void remove(int id) {

    }
}
