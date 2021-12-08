package ru.ssau.tk.kmaster.practice.Interfaces;

public class Main {
    public static void main(String[] args) {
        Info inf1 = new Animal("Semen");
        Info inf2 = new Person("Kirill");
        inf1.showInfo();
        inf2.showInfo();
    }
}
