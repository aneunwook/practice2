package ru.ssau.tk.kmaster.practice.StudyPractice.LambdaFunc.FirstExample;

public class LambdaIntro {
    public static void main(String[] args) {
        ISum summer = new ISum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        ISum summer2 = (a, b) -> a + b;
        ISum summer3 = (a, b) -> {
            return a + b;
        };

        ISqrt sqrt1 = x -> Math.sqrt(x);
        ISqrt sqrt2 = Math::sqrt;
        double y = 4;
        double x = sqrt2.sqrt(y);
        System.out.println(x);

    }

    @FunctionalInterface
    public interface ISum {
        public int sum(int a, int b);
    }

}
