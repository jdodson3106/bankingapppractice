package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by justindodson on 4/24/17.
 */
public class Bank {
    Scanner in = new Scanner(System.in);
    private String name;
    private ArrayList<Branch> branches = new ArrayList<Branch>();

    public Bank(String name, ArrayList<Branch> branches) {

        this.name = name;
        this.branches = branches;
    }

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }


    // creates new branch for the bank and adds that to the
    // bank's colleciton of branches.
    public void addNewBranch(String name) {
        branches.add(new Branch(name));
    }

    // this method creates a new customer on a specific branch
    // if the branch exists. This method calls the private method
    // returnBranchIndex() to search the branch by name.
    public void addCustomerToBranch(String customerName, double initDeposit, String branchName) {
        int index = returnBranchIndex(branchName);
        if (index != -1) {
            Branch branch = branches.get(index);
            branch.addNewCustomer(customerName, initDeposit);
            branches.set(index, branch);
        }
        else {
            System.out.println("Something went wrong.\n" + branchName + " not found.");
        }

    }

    // this method takes a branch name, customer name, and double amount to
    // create a new transaction for a customer at a particular branch of the bank
    public void newCustomerTransaction(String branchName, String customerName, double amount) {
        for(Branch branch : branches) {
            if(branch.getName().equals(branchName)) {
                for (Customer customer : branch.getCustomers()) {
                    if (customer.getName().equals(customerName)) {
                        customer.newTransaction(amount);
                    }
                }
            }
            else {
                System.out.println(branchName + " was not found.");
            }
        }
    }

    public void showCustomerBranchList(String branchName) {
        int index = returnBranchIndex(branchName);
        if (index <= 0) {
            Branch branch = branches.get(index);
            System.out.println("Would you like to see all user transactions? [Y/N]");
            String answer = in.nextLine();
            System.out.println("Customer found at our " + branchName + " branch.");
            for (Customer customer : branch.getCustomers()) {
                System.out.println(customer.getName());
                if (answer.toLowerCase().equals("y" )|| answer.toLowerCase().equals("yes")) {
                    customer.viewAllTransactions();
                }
            }
        }
        else {
            System.out.println("Could not find branch.");
        }
    }

    // this is a private method that returns the index
    // of a particular branch based on its name.
    private int returnBranchIndex(String branchName) {
        int index = -1;
        for(Branch branch : branches) {
            if(branch.getName().equals(branchName)) {
               index = branches.indexOf(branch);
            }
        }
        return index;
    }
}
