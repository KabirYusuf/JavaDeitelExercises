package chapter14.question14_8;

public class PrintingDatesInAnotherFormats {
    public static void main(String[] args) {
        System.out.println(changeDateFormat("01/25/1987"));
    }

    public static String changeDateFormat(String input){
        String output = "";
        String[] token = input.split("/");
        switch (token[0]){
            case "01"-> output = "January "+token[1]+", "+token[2];
            case "02"-> output = "February "+token[1]+", "+token[2];
            case "03"-> output = "March "+token[1]+", "+token[2];
            case "04"-> output = "April "+token[1]+", "+token[2];
            case "05"-> output = "May "+token[1]+", "+token[2];
            case "06"-> output = "June "+token[1]+", "+token[2];
            case "07"-> output = "July "+token[1]+", "+token[2];
            case "08"-> output = "August "+token[1]+", "+token[2];
            case "09"-> output = "September "+token[1]+", "+token[2];
            case "10"-> output = "October "+token[1]+", "+token[2];
            case "11"-> output = "November "+token[1]+", "+token[2];
            case "12"-> output = "December "+token[1]+", "+token[2];
            default -> output = "Input date in the correct format";

        }
        return output;
    }
}
