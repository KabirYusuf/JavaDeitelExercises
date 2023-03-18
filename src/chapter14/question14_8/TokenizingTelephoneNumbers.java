package chapter14.question14_8;

import java.util.Arrays;

public class TokenizingTelephoneNumbers {

    public static void main(String[] args) {
        tokenizePhoneNumber("(555) 555-5555");

    }
    public static void tokenizePhoneNumber(String input){
        String [] tokens = input.split("[\\D&&[^\\s]]");
        System.out.println(Arrays.toString(tokens));
        System.out.printf("Area code : %s%nFirst three digits : %s",tokens[1],tokens[2]);
    }
}
