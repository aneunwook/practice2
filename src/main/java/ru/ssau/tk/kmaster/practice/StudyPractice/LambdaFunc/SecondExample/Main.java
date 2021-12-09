package ru.ssau.tk.kmaster.practice.StudyPractice.LambdaFunc.SecondExample;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Double, Double> sqr = x -> Math.pow(x, 2);
        BiFunction<Integer, Integer, Double> div = (x, y) -> (double) x / y;
        Consumer<Object> printer = System.out::println;

        double x = sqr.apply(10.);
        double y = div.apply(3,4);
        printer.accept(x);
        printer.accept(y);
    }
}
