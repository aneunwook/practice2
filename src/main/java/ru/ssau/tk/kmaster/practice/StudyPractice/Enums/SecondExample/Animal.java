package ru.ssau.tk.kmaster.practice.StudyPractice.Enums.SecondExample;

public enum Animal {
    DOG("Собака"),
    CAT("Кошка"),
    FROG("Лягушка");
    private String transition;

    Animal(String translation) {
        this.transition = translation;
    }

    public String getTransition() {
        return transition;
    }
}
