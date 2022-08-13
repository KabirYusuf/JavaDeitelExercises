package Chapter6;

import java.util.Scanner;

public class BeautifyinStrings {
    private String text;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("Enter text");
        text = input.nextLine();

        BeautifyinStrings beautifyinStrings = new BeautifyinStrings();
//        beautifyinStrings.addFullStopToText(text);
        beautifyinStrings.makeFirstLetterCapitalAndAddFullStop(text);
    }



    private void addFullStopToText(String text){
        int textNumber = text.length();
        if ((text.charAt(textNumber - 1)) != '.'){
            String textWithFullStop = text + '.';
            System.out.printf("Beautified text is: %s%n",textWithFullStop);
        }
        else System.out.print(text);
    }

    public  void makeFirstLetterCapitalAndAddFullStop(String text){
        int textNumber = text.length();
        String output = text.substring(0,1).toUpperCase() + text.substring(1);
        addFullStopToText(output);
    }


}
