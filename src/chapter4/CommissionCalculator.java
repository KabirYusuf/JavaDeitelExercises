package chapter4;

import java.util.Objects;
import java.util.Scanner;

public class CommissionCalculator {
    private final double weeklyPay = 200;
    private final double commission = 0.09;
    private double totalItemSold;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CommissionCalculator commissionCalculator = new CommissionCalculator();

        int total = 0;
        double amount = 0;
        double itemPrice;
        String option;
        do {
            System.out.print("Enter the amount for the" + " " + (total + 1) + " " + "item sold: " );
            itemPrice = input.nextDouble();
            amount += itemPrice;
            commissionCalculator.setTotalItemSold(amount);
            total++;

            System.out.print("Enter Add for more items and no to stop: ");
            input.nextLine();
            option = input.next();
            input.nextLine();
        }

        while ((Objects.equals(option, "Add")) || (Objects.equals(option, "add")) || (Objects.equals(option, "ADD")) );

        if(!Objects.equals(option, "yes")){
            System.out.printf("Total amount of item sold: %.2f%n",commissionCalculator.getTotalItemSold());
            commissionCalculator.printFormat();
        }

    }

    public CommissionCalculator(){}

    public double getTotalItemSold() {
        return totalItemSold;
    }

    public void setTotalItemSold(double items) {
        this.totalItemSold = items;
        int total = 0;
        this.totalItemSold += total;
    }

    public double calculateEarnings(){
        double earnings = totalItemSold * commission + weeklyPay;
        return earnings;
    }

    public void printFormat(){
        System.out.printf("Your total earning is: %.2f",calculateEarnings());
    }
}
