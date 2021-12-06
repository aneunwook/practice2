package ru.ssau.tk.kmaster.practice.Tasks.one.four;

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

    private Points() {

    }
}
