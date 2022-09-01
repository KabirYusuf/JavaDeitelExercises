package Chapter3.Question3_11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    void setUp(){
        account = new Account();
    }

    @Test
    public void testThatMoneyCanBeDeposited(){
        assertEquals(0, account.getBalance());
        account.deposit(200);
        assertEquals(200, account.getBalance());
    }
    @Test
    public void testThatMoneyBelowZeroCantBeDeposited(){
        account.deposit(-20);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testThatMoneyCanBeWithdrawn(){
        account.deposit(5000);
        assertEquals(5000, account.getBalance());
        account.withdraw(2000);
        assertEquals(3000, account.getBalance());
    }
    @Test
    public void testThatMoneyBeyondBalanceCantBeWithdrawn(){
        account.deposit(200);
        assertEquals(200, account.getBalance());
        account.withdraw(500);
        assertEquals(200, account.getBalance());
    }

}