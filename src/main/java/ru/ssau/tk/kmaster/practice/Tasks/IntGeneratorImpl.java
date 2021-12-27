package ru.ssau.tk.kmaster.practice.Tasks;

public class IntGeneratorImpl implements IntGenerator {

    public static int object = 0;

    @Override
    public int nextInt() {
        return object++;
    }
}
