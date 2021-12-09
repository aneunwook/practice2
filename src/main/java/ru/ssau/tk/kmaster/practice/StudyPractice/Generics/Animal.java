package ru.ssau.tk.kmaster.practice.StudyPractice.Generics;

public class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }
}
