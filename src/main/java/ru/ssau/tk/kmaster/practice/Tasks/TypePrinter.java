package ru.ssau.tk.kmaster.practice.Tasks;

import java.util.Objects;

public class TypePrinter {

    public static void printType(byte number) {
        System.out.println("Byte " + number);
    }

    public static void printType(char number) {
        System.out.println("Char " + number);
    }

    public static void printType(short number) {
        System.out.println("Short " + number);
    }

    public static void printType(int number) {
        System.out.println("Int " + number);
    }

    public static void printType(long number) {
        System.out.println("Long " + number);
    }

    public static void printType(float number) {
        System.out.println("Float " + number);
    }

    public static void printType(double number) {
        System.out.println("Double " + number);
    }

    public static void printType(boolean number) {
        System.out.println("Boolean " + number);
    }

    public static void printType(Object number) {
        if (number == null) {
            System.out.println("Null");
        } else {
            System.out.println(Objects.requireNonNull(number).getClass());
        }
    }
}
