package chapter7.Q7_20;

import java.security.SecureRandom;

public class ArcheryGame {

    private static final SecureRandom secureRandom = new SecureRandom();

    public static void main(String[] args) {
        resultOfAccumulatedPoints();

    }

    private static int [][] gamePoints(){
        int [][] archeryPoints = new int[4][4];
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                archeryPoints[i][j] = secureRandom.nextInt(11);
                sum+=archeryPoints[i][j];
                if(j == 3){
                    sum -= archeryPoints[i][j];
                    archeryPoints[i][j] = sum;
                }
            }
            sum = 0;
        }
        return archeryPoints;
    }

    private static void resultOfAccumulatedPoints(){
        int [][] points = gamePoints();
        int count = 0;
        int maxScore = points[0][3];
        System.out.println("\t\t\t\t\t  Chan1\t\t\t  Chan2\t\t\t  Chan3\t\t\t\tTot");
        for (int i = 0; i < 4; i++) {
            System.out.print("Player "+ (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.print("\t\t\t\t" + points[i][j]);
            }
            System.out.println();
        }

        getWinner(points, count, maxScore);
    }

    private static void getWinner(int[][] points, int count, int maxScore) {
        for (int i = 0; i < 4; i++) {
            if(points[i][3] > maxScore){
                maxScore = points[i][3];
                count = i;
            }
        }
        System.out.println("The Highest point is " + maxScore);
        System.out.println("Player " + (count + 1) +" is the winner");
    }
}
