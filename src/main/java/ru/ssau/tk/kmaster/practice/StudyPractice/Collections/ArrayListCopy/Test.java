package ru.ssau.tk.kmaster.practice.StudyPractice.Collections.ArrayListCopy;

public class Test {

    public static void main(String[] args) {
        MyList<String> arr = new MyArrayList<>();
        arr.add("Первый элемент");
        arr.add("Второй элемент");
        arr.add("Третий элемент");

        System.out.println(arr.size() + "\n");

        arr.delete(1);

        System.out.println(arr.size() + "\n");

        arr.update(1, "Второй элемент");

        for (String str : arr) {
            System.out.println(str);
        }
    }
}
