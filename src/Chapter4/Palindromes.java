package Chapter4;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String backward = "";
        int numberLength = 0;
        String number;




        while(numberLength != 5) {
            System.out.println("Number must be 5 digits");

            numberLength = 0;
            backward = "";

            System.out.print("Enter number to determine if its a palindrome or not: ");
            number = input.nextLine();

            System.out.println(number);
            numberLength = numberLength + number.length();


            if(numberLength == 5){
                for (int i = numberLength - 1; i >= 0; i--) {
                    backward = backward + number.charAt(i);
                }
                if (number.equals(backward)) {
                    System.out.print("Palindrome number");
                } else {
                    System.out.print("Not a palindrome");
                }
            }
            System.out.println();

        }



    }
}
