package ru.ssau.tk.kmaster.practice.Tasks;

public class Test {
    public static void main(String[] args) {
        Point p_1 = new Point(1.2, 3.1, 6.7);
        Point p_2 = new Point(3.6, 1.2, 7);
        Point p_3 = Points.sum(p_1, p_2);
        Point p_4 = Points.subtract(p_1, p_2);
        Point p_5 = Points.multiply(p_1, p_2);
        Point p_6 = Points.divide(p_1, p_2);
    }
}
