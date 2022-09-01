package Chapter3.Question3_11;

public class Account {

    private int balance;

    public Account(){}

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount >= 0)balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance)balance -= amount;
    }
}
