package ru.ssau.tk.kmaster.practice.PasswordGenerator;

import java.util.Locale;
import java.util.Random;

public class GenPass {

    private static final String alphabetLC = "abcdefghijklmnopqrstuvwxyz";
    private static final String alphabetUC = alphabetLC.toUpperCase();
    private static final String numbers = "1234567890";
    private static final String symbols = "`!@#$%^&?*(){}[]|/.,-+=";

    public static String generatePassword(int count) {

        String all = alphabetLC + alphabetUC + numbers + symbols;

        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(all.charAt(rand.nextInt(all.length())));
        }
        return sb.toString();
    }

    public static String generatePasswordWithoutSymbols(int count) {

        String all = alphabetLC + alphabetUC + numbers;

        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(all.charAt(rand.nextInt(all.length())));
        }
        return sb.toString();
    }

}
