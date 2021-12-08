package ru.ssau.tk.kmaster.practice.StudyPractice.Interfaces;

public class Animal implements Info {

    public String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public void showInfo() {
        System.out.println("Animal has a nickname " + nickname);
    }

}
