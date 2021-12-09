package ru.ssau.tk.kmaster.practice.StudyPractice.Generics;

public class Dog extends Animal{
    private  int id;
    public Dog(int id) {
        super(id);
        this.id = id;
    }
    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
