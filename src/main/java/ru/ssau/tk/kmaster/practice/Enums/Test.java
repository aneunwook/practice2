package ru.ssau.tk.kmaster.practice.Enums;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Level.values()));
        System.out.println(Level.BEGGINER.getColor());
        Level.BEGGINER.setColor("red");
        System.out.println(Level.BEGGINER.getColor());
        System.out.println(Level.BEGGINER.toString());
    }
}
