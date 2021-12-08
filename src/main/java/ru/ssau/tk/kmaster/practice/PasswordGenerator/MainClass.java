package ru.ssau.tk.kmaster.practice.PasswordGenerator;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        boolean useLower = false;
        boolean useUpper = false;
        boolean useDigits = false;
        boolean useSymbols = false;

        Scanner console = new Scanner(System.in);

        System.out.println("Введите кол-во символов в пароле ");
        int num = console.nextInt();
        //TODO: реализовать проверку num на число
        System.out.println("Пароль должен состоять из маленьких англ. букв?");
        String str = console.next();
        if (str.equalsIgnoreCase("Да") || str.equalsIgnoreCase("Yes") || str.equals("+")) {
            useLower = true;
        }
        System.out.println("Пароль должен состоять из больших англ. букв?");
        str = console.next();
        if (str.equalsIgnoreCase("Да") || str.equalsIgnoreCase("Yes") || str.equals("+")) {
            useUpper = true;
        }
        System.out.println("Пароль должен состоять из цифр?");
        str = console.next();
        if (str.equalsIgnoreCase("Да") || str.equalsIgnoreCase("Yes") || str.equals("+")) {
            useDigits = true;
        }
        System.out.println("Пароль должен состоять из символов?");
        str = console.next();
        if (str.equalsIgnoreCase("Да") || str.equalsIgnoreCase("Yes") || str.equals("+")) {
            useSymbols = true;
        }

        GenPass genPass = new GenPass(useLower, useUpper, useDigits, useSymbols, num);
        System.out.println(genPass.generatePassword());
    }
}