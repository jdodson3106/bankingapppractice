package com.company;

import java.util.ArrayList;

/**
 * Created by justindodson on 4/24/17.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name, ArrayList<Branch> branches) {

        this.name = name;
        this.branches = branches;
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
}
