import java.util.Random;

public class EncryptedPassword {
    public static void main(String[] args) {
        System.out.println(encryptedPassword(10));
    }

    public static StringBuilder encryptedPassword(int len){
        Random random = new Random();
        String password ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder encryptedPassword = new StringBuilder();
        for (int i = 0; i < len; i++) {
            encryptedPassword.append(password.charAt(random.nextInt(password.length())));
        }
        return encryptedPassword;
    }
}
