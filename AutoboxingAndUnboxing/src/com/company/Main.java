package com.company;

public class Main {

    public static void main(String[] args) {
	    Bank myBank = new Bank("Dodson Trust");

        myBank.addNewBranch("Dodson One");
        myBank.addCustomerToBranch("Justin Dodson", 500.00, "Dodson One");
        myBank.newCustomerTransaction("Dodson One", "Justin Dodson", -200.00);
        myBank.newCustomerTransaction("Dodson One", "Justin Dodson", -200.00);
        myBank.addCustomerToBranch("Noah Dodson", 100.00, "Dodson One");
        myBank.newCustomerTransaction("Dodson One", "Noah Dodson", -20.00);
        myBank.showCustomerBranchList("Dodson One");

        //TODO create menu so that I can auto create these transactions.
    }
}
