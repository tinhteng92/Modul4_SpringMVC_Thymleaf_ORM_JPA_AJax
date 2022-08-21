package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CrudCustomer {
    public List<Customer> customers = new ArrayList<>();

    public CrudCustomer(){
        customers.add(new Customer(0, "T", "t@gmail.com", "Da Nang"));
        customers.add(new Customer(1, "Nhat", "nhat@gmail.com", "Ha Noi"));
        customers.add(new Customer(2, "Trang", "trang@gmail.com", "Da Nang"));
        customers.add(new Customer(3, "Nguyen Binh Son", "son@gmail.com", "Hai Phong"));
        customers.add(new Customer(4, "Dang Xuan Hoa", "hoa.dang@gmail.com", "Nam Dinh"));
    }

    public Customer findById(int id){
        for (Customer c: customers){
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }
}
