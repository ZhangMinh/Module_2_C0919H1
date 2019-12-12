package Commons;

import Models.Customer;

import java.util.Comparator;

public class NameComperator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getHoVaTen ().compareTo ( o2.getHoVaTen () );
    }
}
