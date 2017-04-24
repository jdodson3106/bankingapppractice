package com.company;

import java.util.ArrayList;

/**
 * Created by justindodson on 4/24/17.
 */
public class Customer {

    private String name;
    private double initAmount;
    private ArrayList<Double> transactions;

    public Customer(String name, double initAmount) {
        this.name = name;
        this.initAmount = initAmount;
        transactions.add(initAmount); // puts initial deposit when creating an account into the transactions list.
    }

    public void newTransaction(double amount) {
        transactions.add(amount);
    }

    public void viewAllTransactions() {
        int counter = 1;
        for(double transaction: this.transactions) {
            System.out.println(counter + ".) " + transaction);
        }
    }




}
