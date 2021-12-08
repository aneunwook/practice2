package ru.ssau.tk.kmaster.practice.PasswordGenerator;

import java.util.Random;

public class GenPass {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = LOWER.toUpperCase();
    private static final String DIGITS = "1234567890";
    private static final String SYMBOLS = "!@#$%&*()_+-=[]|,./?><";

    static private boolean useLower;
    static boolean useUpper;
    static boolean useDigits;
    static boolean useSymbols;
    static int count;

    public GenPass(boolean useLower, boolean useUpper, boolean useDigits, boolean useSymbols, int count) {
        this.useDigits = useDigits;
        this.useLower = useLower;
        this.useUpper = useUpper;
        this.useSymbols = useSymbols;
        this.count = count;

    }

    public static String generatePassword() {

        StringBuilder str = new StringBuilder();

        if (useLower) {
            str.append(LOWER);
        }
        if (useUpper) {
            str.append(UPPER);
        }
        if (useDigits) {
            str.append(DIGITS);
        }
        if (useSymbols) {
            str.append(SYMBOLS);
        }

        if (str.toString().equals("")) {
            return "Пароль должен состоять из чего-то, повторите попытку!";
        } else {
            Random rand = new Random();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < count; i++) {
                sb.append(str.charAt(rand.nextInt(str.length())));
            }
            return "Ваш пароль: \n" + sb.toString();
        }
    }
}
