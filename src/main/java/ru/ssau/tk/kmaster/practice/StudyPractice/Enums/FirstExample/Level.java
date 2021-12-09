package ru.ssau.tk.kmaster.practice.StudyPractice.Enums.FirstExample;

public enum Level {
    BEGGINER("green"),
    EXPERT("white");
    private String color;

    Level(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Level  = " + name();
    }
}
