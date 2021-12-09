package ru.ssau.tk.kmaster.practice.StudyPractice.Enums.ThirdExample;

public enum Season {
    SUMMER(25),
    WINTER(-25),
    AUTEMN(15),
    SPRING(20);
    private  int temp;

    Season(int temp){
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
