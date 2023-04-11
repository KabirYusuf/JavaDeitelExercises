package chapter4;

public class DataEncryption {
    public static void main(String[] args) {

    }


    public static boolean isValidNumber(String number) {
//        int validNum = number / 1000;
//        return validNum >= 1 && validNum <= 9;
        return number.length() == 4;
    }

    public static String encryptData(String data) {
        if (!isValidNumber(data))return "Enter  a valid number";
        String resultOfEncryption = "";
        for (int i = 0; i < data.length(); i++) {
            int value = (Character.getNumericValue(data.charAt(i)) + 7) % 10;
            resultOfEncryption += String.valueOf(value);
        }
        return resultOfEncryption;
    }

    public static String decryptData(String data) {
        if (!isValidNumber(data))return "Enter  a valid number";
        String resultOfDecryption = "";
        int originalData;
        for (int i = 0; i < data.length(); i++) {
            int value = (Character.getNumericValue(data.charAt(i)));
            if (value >= 7)originalData = value - 7;

            else originalData = value + 10 - 7;

            resultOfDecryption += originalData;
        }
        return resultOfDecryption;
    }
}
