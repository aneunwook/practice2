package ru.ssau.tk.kmaster.practice.StudyPractice.Interfaces;

public class Person implements  Info{

    public String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Person has a name " + name);
    }

}
