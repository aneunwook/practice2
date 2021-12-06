package ru.ssau.tk.kmaster.practice.Tasks.one.six;

public class Point {
    final public double x;
    final public double y;
    final public double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}
