package Chapter4;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base length of triangle: ");
        int baseLength = input.nextInt();

        if((baseLength >= 1) && (baseLength <= 10)){
            for (int row = 1; row <= baseLength ; row++) {

                for (int col = 1; col <= row; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.print("Not a valid number");
        }
    }

}
