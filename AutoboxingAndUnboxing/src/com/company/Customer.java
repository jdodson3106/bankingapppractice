package com.company;

import java.util.ArrayList;

/**
 * Created by justindodson on 4/24/17.
 */
public class Customer {

    private String name;
    private double initAmount;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double initAmount) {
        this.name = name;
        this.initAmount = initAmount;
        transactions.add(initAmount); // puts initial deposit when creating an account into the transactions list.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitAmount() {
        return initAmount;
    }

    public void setInitAmount(double initAmount) {
        this.initAmount = initAmount;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }

    public void newTransaction(double amount) {
        transactions.add(amount);
    }

    public void viewAllTransactions() {
        int counter = 1;
        for(double transaction: this.transactions) {
            System.out.println(counter + ".) " + transaction);
            counter++;
        }
    }




}
