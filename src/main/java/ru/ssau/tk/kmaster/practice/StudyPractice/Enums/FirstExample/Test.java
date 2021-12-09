package ru.ssau.tk.kmaster.practice.StudyPractice.Enums.FirstExample;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String color = "white";
        Level lvl = Level.EXPERT;
        if (lvl.getColor().equals(color)) {
            System.out.println(lvl.name() + " is " + lvl.getColor());
        }
        System.out.println(lvl instanceof Level);
        System.out.println(Arrays.toString(Level.values()));
        System.out.println(Level.BEGGINER.getColor());
        Level.BEGGINER.setColor("red");
        System.out.println(Level.BEGGINER.getColor());
        System.out.println(Level.BEGGINER);
        System.out.println(lvl.getColor());
        System.out.println(lvl);
    }
}
