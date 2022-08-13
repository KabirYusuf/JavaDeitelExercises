package Chapter6;

public class PerfectNumber {
    public static void main(String[] args) {

        PerfectNumber perfectNumber = new PerfectNumber();
        for (int i = 2; i < 1000; i++) {
            isPerfect(i);
        }

    }



    public static void isPerfect(int number){
        int perfectNumber = 1;
        for (int i = number - 1; i > 1 ; i--){
            if(number % i == 0) {
                perfectNumber += i;
            }
        }
        if(perfectNumber == number) {
            System.out.printf("Number %d is a perfect number%n", number);
        }
    }
}
