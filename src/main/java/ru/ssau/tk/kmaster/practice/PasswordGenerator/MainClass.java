package ru.ssau.tk.kmaster.practice.PasswordGenerator;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер вашего пароля: ");
        int x = console.nextInt();
        System.out.println("В вашем пароле должны быть символы?");
        String flag = console.next();
        if (flag.equalsIgnoreCase("да") || flag.equals("+")) {
            System.out.println(GenPass.generatePassword(x));
        } else {
            System.out.println(GenPass.generatePasswordWithoutSymbols(x));
        }
    }
}
