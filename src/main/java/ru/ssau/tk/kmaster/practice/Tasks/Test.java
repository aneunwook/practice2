package ru.ssau.tk.kmaster.practice.Tasks;

public class Test {
    public static void main(String[] args) {
        Point p_1 = new Point(1.2, 6.2, 8.2);
        Point p_2 = new Point(6.1, 8.1, 1.1);
        double x = Points.scalarProduct(p_1, p_2);
        Point multVectors = Points.vectorProduct(p_1, p_2);
    }
}
