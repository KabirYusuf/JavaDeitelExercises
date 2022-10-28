package chapter4.CreditLimitCalculator;

import java.util.Objects;

public class CreditLimitCalculator {

    private  Customer [] customers = new Customer[5];
   private int counter = 0;

    public void addCustomer(int accountNumber, int beginningOfMonthBalance, int totalOfAllItemChargedByCustomer, int totalOfAllCreditApplied, int allowedCreditLimit){
        Customer customer = new Customer(accountNumber,beginningOfMonthBalance,totalOfAllItemChargedByCustomer,totalOfAllCreditApplied,allowedCreditLimit);
        customers[counter] = customer;
        counter++;

    }

    public Customer getCustomer(int accountNumber) {
        for (Customer customer:customers) {
            if(Objects.equals(accountNumber, customer.getAccountNumber())){
                return customer;

            }

        }
        return null;
    }


    public int getMonthBeginningBalance(int accountNumber) {
        Customer customer = getCustomer(accountNumber);
        return customer.getBeginningOfMonthBalance();
    }

    public int getTotalItemCharged(int accountNumber) {
        Customer customer = getCustomer(accountNumber);
        return customer.getTotalOfAllItemChargedByCustomer();
    }

    public int getTotalCreditApplied(int accountNumber) {
        Customer customer = getCustomer(accountNumber);
        return customer.getTotalOfAllCreditApplied();
    }

    public int newBalance(int accountNumber) {
        return  getMonthBeginningBalance(accountNumber) +
                getTotalCreditApplied(accountNumber) -
                getTotalItemCharged(accountNumber);
    }

    public boolean isCreditLimitGreater(int accountNumber) {
        Customer customer = getCustomer(accountNumber);
        return customer.getAllowedCreditLimit() > newBalance(accountNumber);
    }

    public void displayNewBalance(int accountNumber) {
        System.out.println(newBalance(accountNumber));
        if(isCreditLimitGreater(accountNumber)){
            System.out.println("Credit Limit Exceeded");
        }
        else {
            System.out.println("Credit Limit Not Exceeded");
        }
    }
}
