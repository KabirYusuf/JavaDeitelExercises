package chapter4.creditLimitCalculator;

public class Customer {
    private int accountNumber;
    private int beginningOfMonthBalance;
    private int totalOfAllItemChargedByCustomer;
    private int totalOfAllCreditApplied;
    private int allowedCreditLimit;

    public Customer(int accountNumber, int beginningOfMonthBalance, int totalOfAllItemChargedByCustomer, int totalOfAllCreditApplied, int allowedCreditLimit) {
        this.accountNumber = accountNumber;
        this.beginningOfMonthBalance = beginningOfMonthBalance;
        this.totalOfAllItemChargedByCustomer = totalOfAllItemChargedByCustomer;
        this.totalOfAllCreditApplied = totalOfAllCreditApplied;
        this.allowedCreditLimit = allowedCreditLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBeginningOfMonthBalance() {
        return beginningOfMonthBalance;
    }

    public void setBeginningOfMonthBalance(int beginningOfMonthBalance) {
        this.beginningOfMonthBalance = beginningOfMonthBalance;
    }

    public int getTotalOfAllItemChargedByCustomer() {
        return totalOfAllItemChargedByCustomer;
    }

    public void setTotalOfAllItemChargedByCustomer(int totalOfAllItemChargedByCustomer) {
        this.totalOfAllItemChargedByCustomer = totalOfAllItemChargedByCustomer;
    }

    public int getTotalOfAllCreditApplied() {
        return totalOfAllCreditApplied;
    }

    public void setTotalOfAllCreditApplied(int totalOfAllCreditApplied) {
        this.totalOfAllCreditApplied = totalOfAllCreditApplied;
    }

    public int getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    public void setAllowedCreditLimit(int allowedCreditLimit) {
        this.allowedCreditLimit = allowedCreditLimit;
    }


}
