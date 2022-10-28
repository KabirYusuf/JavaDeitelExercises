package chapter4.CreditLimitCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitCalculatorTest {
    private  CreditLimitCalculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new CreditLimitCalculator();
    }
    @Test
    void testThatANewCustomerCanBeAdded(){
        calculator.addCustomer(1,200,30,20,100);
        calculator.addCustomer(2,300,5,32,250);
    }
    @Test
    void testToFindCustomerBalanceAtBeginningOfMonthUsingAccountNumber(){
        calculator.addCustomer(1,200,30,20,100);
        calculator.addCustomer(2,300,5,32,250);
        assertEquals(200, calculator.getMonthBeginningBalance(1));

    }

    @Test
    void testToGetTotalOfAllItemsChargedByCustomers(){
        calculator.addCustomer(1,200,30,20,100);
        assertEquals(30, calculator.getTotalItemCharged(1));
    }

    @Test
    void testToGetTotalOfAllCreditAppliedToACustomers(){
        calculator.addCustomer(1,200,30,20,100);
        assertEquals(20, calculator.getTotalCreditApplied(1));
    }

    @Test
    void testToCalculateNewBalanceForAParticularCustomerWhoseAccountNumberIsEntered(){
        calculator.addCustomer(1,200,30,20,100);
        calculator.addCustomer(2,300,5,32,250);
        assertEquals(327, calculator.newBalance(2));
    }

    @Test
    void tesThatTrueIsReturnedIfCreditLimitIsGreaterThanNewBalance(){
        calculator.addCustomer(2,300,5,32,800);
        calculator.newBalance(2);
        assertTrue(calculator.isCreditLimitGreater(2));
    }
    @Test
    void testToDisplayCustomerNewBalance(){
        calculator.addCustomer(2,300,5,32,80);
        calculator.displayNewBalance(2);
    }


}