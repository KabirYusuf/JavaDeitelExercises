package chapter6;

public class PrimeNumbers {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i <= 10_000; i++) {
           boolean result = primeNumber(i);
           if(result){
               System.out.println(i);
               count ++;
           }
        }
        System.out.println("The total number of prime number between 1 and 10,000 is" + " "+ count);

    }


    public static boolean primeNumber(int number) {
        int total = 0;
        if (number == 1) {}
        else {
            for (int i = number; i >= 1; i--) {
                if (number % i == 0) {
                    total++;
                }
            }
            if (total == 2) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

}

