package day30_Week06_Review;

import java.util.Random;

public class C05_RandomPassword {

    public static void main(String[] args) {

        String str = "ABCDEFGHIJKLMNOPQRSTUVWYZabcdefgijklmnoprstuvwxyz0123456789_!@#$%&*";


        String password="";

        // 8 haneli şifre

        Random random = new Random();

        int randomIndex;


        for (int i = 0; i < 4 ; i++) {
            randomIndex = random.nextInt(str.length());
            password += str.charAt(randomIndex);

        }
        System.out.println(password);

    }
}
