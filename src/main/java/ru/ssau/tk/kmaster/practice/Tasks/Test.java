package ru.ssau.tk.kmaster.practice.Tasks;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1.4, 8.1, 7);
        Point rez_1 = Points.opposite(point);
        Point rez_2 = Points.inverse(point);
    }
}
