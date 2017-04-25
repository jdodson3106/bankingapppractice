package com.company;

import java.util.ArrayList;

/**
 * Created by justindodson on 4/24/17.
 */
public class Branch {

    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private String name;

    public Branch(ArrayList<Customer> customers, String name) {
        this.customers = customers;
        this.name = name;
    }

    public Branch(String name) {
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return name;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    // adds new customer to the customer list.
    public void addNewCustomer(String name, double deposit) {
        customers.add(new Customer(name, deposit));
    }

    public void getAllCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.getName());
        }
    }

    // this method takes the customer name and amount to add a new transaction to the
    // customer's portfolio. This method calls the private returnCustomerIndex method
    // to find the customer by name. The method then creates a customer from the index
    // adds a new transaction and then sets the customer back into the collection with
    // the new data.
    public void addCustomerTransactions(String name, double amount) {
        int index = returnCustomerIndex(name);
        if (index != -1) {
            Customer customer = customers.get(index);
            customer.newTransaction(amount);
            customers.set(index, customer);
        }
        else {
            System.out.println("Invalid Transaction.\nCustomer " + name + " not found.");
        }
    }

    // This is a private method to search for index of Customer by name
    private int returnCustomerIndex(String name) {
        int index = -1;
        for(Customer customer : customers) {
            if (customer.getName().equals(name)) {
                index = customers.indexOf(customer);
                break;
            }
        }
        return index;
    }


}
