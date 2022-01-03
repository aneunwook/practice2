package ru.ssau.tk.kmaster.practice.StudyPractice.Collections.ArrayListCopy;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        MyList<String> arr = new MyArrayList<String>();
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

        System.out.println("\n");

        List<String> list = new ArrayList<>();
        list.add("Проверка");

        MyList<String> arrayList = new MyArrayList<>(list);
        System.out.println(arrayList.get(0));
    }
}
