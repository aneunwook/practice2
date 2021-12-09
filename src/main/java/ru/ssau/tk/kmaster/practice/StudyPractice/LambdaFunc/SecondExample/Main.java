package ru.ssau.tk.kmaster.practice.StudyPractice.LambdaFunc.SecondExample;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Double, Double> sqr = x -> Math.pow(x, 2);
        BiFunction<Integer, Integer, Double> div = (x, y) -> (double) x / y;
        Consumer<Object> printer = System.out::println;

        double x = sqr.apply(10.);
        double y = div.apply(3, 4);
        printer.accept(x);
        printer.accept(y );
        printer.accept("");

        //Добавим метод forEach() типа Iterable
        //void forEach(Consumer<? super T> action)
        int[] ints = {1, 2, 3, 4, 5};
        Arrays.stream(ints).forEach(System.out::println);
        Arrays.stream(ints).forEach(i -> {
            System.out.println("i = " + i);
            System.out.println("i^2 = " + i * i);
        });
    }
}
