package en.sline.generator;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int length = 32;
        System.out.println(generatePassword(length));
    }

    public static char[] generatePassword(int len){
        System.out.println("Your Password:");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String nums = "0123456789";
        String symbols = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        String passwordSymbols = charsCaps + chars + nums + symbols;
        Random rdn = new Random();

        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++){
            password[i] = passwordSymbols.charAt(rdn.nextInt(passwordSymbols.length()));
        }
        return password;
    }
}
