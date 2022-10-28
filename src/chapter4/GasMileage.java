package chapter4;

import java.util.Scanner;

public class GasMileage {
private static  int totalMileAmount;
private static  int totalGallonAmount;

    public GasMileage(){

    }

    static void amountOfMileAndFuel(){
        Scanner input = new Scanner(System.in);
        int totalMileAmount = 0;
        int totalGallonAmount = 0;
        int trip = 1;
        double milesPerGallon;

        System.out.println("Enter amount of miles for trip" + " "+ trip + " " + "or -1 to stop");
        int mile = input.nextInt();

        System.out.println("Enter amount of gallon of fuel for trip" + " "+ trip  + " " + "or -1 to stop");
        int gallon = input.nextInt();

        milesPerGallon = mile / gallon;

        System.out.printf("%nMiles per gallon for trip %d is: %f%n", trip, milesPerGallon);

        while ((mile != -1) || (gallon != -1)){

            trip++;
            totalMileAmount += mile;
            totalGallonAmount += gallon;

            System.out.println(totalMileAmount);
            System.out.println(totalGallonAmount);

            System.out.println();

            System.out.println("Enter amount of miles for trip" + " "+ trip + " " + "or -1 to stop");
            mile = input.nextInt();

            System.out.println("Enter amount of gallon of fuel for trip" + " "+ trip  + " " + "or -1 to stop");
            gallon = input.nextInt();

            if( mile != -1 || gallon != -1){
                milesPerGallon = mile / gallon;

                System.out.printf("%nMiles per gallon for trip %d is: %f%n", trip, milesPerGallon);
            }
        }

        System.out.println();
        calculateTotalAmountOfMilesPerGallon(totalMileAmount, totalGallonAmount);
    }

    private  static void calculateTotalAmountOfMilesPerGallon(int mileAmount, int gallonAmount){

        double totalMilesPerGallonAmount = mileAmount / gallonAmount;
        System.out.printf("Total miles/gallon amount for the total journey is: %f", totalMilesPerGallonAmount);

    }

    public static void main(String[] args) {
        amountOfMileAndFuel();
    }

}
