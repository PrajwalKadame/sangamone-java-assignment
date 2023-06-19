package oops_concept;

import java.util.HashMap;
import java.util.Map;

class Customer {
    private int customerId;
    private String name;
    private String address;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

class Bank1 {
    private Map<Integer, Customer> customers= new HashMap<>();

    public void addCustomer(int customerId, String name, String address) {
        if (!customers.containsKey(customerId)) {
            Customer customer = new Customer(customerId, name, address);
            customers.put(customerId, customer);
            System.out.println("Customer added: " + customer.getName());
        } else {
            System.out.println("Customer with ID " + customerId + " already exists.");
        }
    }

    public Customer getCustomer(int customerId) {
        if (customers.containsKey(customerId)) {
            return customers.get(customerId);
        } else {
            System.out.println("Customer with ID " + customerId + " does not exist.");
            return null;
        }
    }
}


public class MainBank {
    public static void main(String[] args) {
        Bank1 bank = new Bank1();

       
        bank.addCustomer(0001, "PK", "Rajaji Nagar");
        bank.addCustomer(0002, "KP", "Bannergatta");

        
        Customer customer1 = bank.getCustomer(0001);
        if (customer1 != null) {
            System.out.println("Customer ID: " + customer1.getCustomerId());
            System.out.println("Name: " + customer1.getName());
            System.out.println("Address: " + customer1.getAddress());
        }

        Customer customer2 = bank.getCustomer(0003);
        if (customer2 != null) {
            System.out.println("Customer ID: " + customer2.getCustomerId());
            System.out.println("Name: " + customer2.getName());
            System.out.println("Address: " + customer2.getAddress());
        }
    }
}

