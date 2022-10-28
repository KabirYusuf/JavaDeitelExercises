package chapter4Test;

import chapter4.CommissionCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommissionCalculatorTest {
    CommissionCalculator commissionCalculator;


    @BeforeEach
    void setUp(){
        commissionCalculator = new CommissionCalculator();
        commissionCalculator.setTotalItemSold(500);

    }
    @Test
    public void testTotalAmountOfSales(){
        assertEquals(500, commissionCalculator.getTotalItemSold());
    }

    @Test
    public void testTotalEarnings(){
        assertEquals(245, commissionCalculator.calculateEarnings());
    }

    @Test
    public void printFormat(){
        assertEquals(245, commissionCalculator.calculateEarnings());
        commissionCalculator.printFormat();
    }
}
