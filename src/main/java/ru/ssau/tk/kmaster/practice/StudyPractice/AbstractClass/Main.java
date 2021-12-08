package ru.ssau.tk.kmaster.practice.StudyPractice.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        Cat a3 = new Cat();
        a1.makeSound();
        a2.makeSound();
        a3.letsGo();
    }
}
