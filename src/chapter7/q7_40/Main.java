package chapter7.q7_40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Polling polling = new Polling();
    private static Scanner scanner = new Scanner(System.in);

    private static  String []topics = polling.getTopics();

    private static  int [][]responses = polling.getSurveyResponses();

    public static void main(String[] args) {
        startSurvey();
    }

    private static void startSurvey() {
        prompt("Enter total number of people to rate in the survey");
       try {
           int totalNumber = scanner.nextInt();
           prompt("Rate Accordingly");
           for (int i = 0; i < totalNumber; i++) {
               prompt("User " + (i + 1) + " Enter ratings");
               topicRatings();
           }
           polling.displaySurveyResult();
       }catch (InputMismatchException e){
          catchBlock();
           startSurvey();
       }

    }

    private static void topicRatings() {
        getResponseForPoliticalIssue();
        getResponseForGlobalIssue();
        getResponseForMentalIssue();
        getResponseForReligious();
        getResponseForEnvironmental();
        System.out.println();
    }

    private static void getResponseForPoliticalIssue(){
       try {
           prompt("Enter rating for " + topics[0]);
           int rating = scanner.nextInt();
           ++responses[0][rating-1];
       }catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
           catchBlock();
           getResponseForPoliticalIssue();
       }
    }

    private static void catchBlock() {
        prompt("Enter a valid number to rate");
        scanner.nextLine();
    }

    private static void getResponseForGlobalIssue(){
        try {
            prompt("Enter rating for " + topics[1]);
            int rating = scanner.nextInt();
            ++responses[1][rating-1];
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
            catchBlock();
            getResponseForGlobalIssue();
        }
    }
    private static void getResponseForMentalIssue(){
        try {
            prompt("Enter rating for " + topics[2]);
            int rating = scanner.nextInt();
            ++responses[2][rating-1];
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
            catchBlock();
            getResponseForMentalIssue();
        }
    }
    private static void getResponseForReligious(){
        try {
            prompt("Enter rating for " + topics[3]);
            int rating = scanner.nextInt();
            ++responses[3][rating-1];
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
            catchBlock();
            getResponseForReligious();
        }
    }
    private static void getResponseForEnvironmental(){
        try {
            prompt("Enter rating for " + topics[4]);
            int rating = scanner.nextInt();
            ++responses[4][rating-1];
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
            catchBlock();
            getResponseForEnvironmental();
        }
    }


    private static void prompt(String displayMessage) {
        System.out.println(displayMessage);
    }
}
