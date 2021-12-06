package ru.ssau.tk.kmaster.practice.Tasks.one.seven;

public class Points {
    public static Point sum(Point first, Point second) {
        return new Point(first.x + second.x, first.y + second.y, first.z + second.z);
    }

    static public Point subtract(Point first, Point second) {
        return new Point(first.x - second.x, first.y - second.y, first.z - second.z);
    }

    static public Point multiply(Point first, Point second) {
        return new Point(first.x * second.x, first.y * second.y, first.z * second.z);
    }

    static public Point divide(Point first, Point second) {
        return new Point(first.x / second.x, first.y / second.y, first.z / second.z);
    }

    static public Point enlarge(Point point, double num) {
        return new Point(point.x * num, point.y * num, point.z * num);
    }

    static public double length(Point p) {
        return p.length();
    }

    static public Point opposite(Point p) {
        return new Point(-p.x, -p.y, -p.z);
    }

    static public Point inverse(Point p) {
        return new Point(1 / p.x, 1 / p.y, 1 / p.z);
    }

    private Points() {

    }
}
