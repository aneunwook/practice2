package ru.ssau.tk.kmaster.practice.Tasks;

public class ResettableIntGenerator implements IntGenerator, Resettable {

    public static int number = 0;

    @Override
    public int nextInt() {
        return number++;
    }

    @Override
    public void reset() {
        number = 0;
    }
}