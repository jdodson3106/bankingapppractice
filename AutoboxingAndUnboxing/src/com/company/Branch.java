package com.company;

import java.util.ArrayList;

/**
 * Created by justindodson on 4/24/17.
 */
public class Branch {

    private ArrayList<Customer> customers;

    public Branch(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    // adds new customer to the customer list.
    public void addNewCustomer(String name, double deposit) {

        customers.add(new Customer(name, deposit));
    }

    public void addCustomerTransactions(String name, double amount) {
        // TODO grab customer object based on name and add a transaction of amount;
    }


}
