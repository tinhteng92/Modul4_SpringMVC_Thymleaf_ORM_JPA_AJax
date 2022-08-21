package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements ICustomerService{
    public List<Customer> customers = new ArrayList<>();

    public CustomerService(){
        customers.add(new Customer(0, "Tinh", "t@gmail.com", "Da Nang"));
        customers.add(new Customer(1, "Nhat", "nhat@gmail.com", "Ha Noi"));
        customers.add(new Customer(2, "Trang", "trang@gmail.com", "Da Nang"));
        customers.add(new Customer(3, "Son", "son@gmail.com", "Hai Phong"));
        customers.add(new Customer(4, "Hoa", "hoa.dang@gmail.com", "Nam Dinh"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers);
    }

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }


    @Override
    public void update(int id, Customer customer) {
        customers.set(findIndex(id), customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(findIndex(id));

    }

    public Customer findById(int id){
        for (Customer c: customers){
            if (c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public int findIndex(int id){
        for (int i = 0; i < customers.size(); i++){
            if(customers.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
}
