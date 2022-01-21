package ru.ssau.tk.kmaster.practice.StudyPractice.Collections.LinkedListCopy;

public class Test {
    public static void main(String[] args) {
        LinkedListCopy listCopy = new LinkedListCopy();
        listCopy.add(1);
        listCopy.add(3);
        listCopy.add(10);

        System.out.println(listCopy);
        System.out.println(listCopy.get(2));

        listCopy.remove(1);
        System.out.println(listCopy);
        listCopy.remove(0);
        System.out.println(listCopy);
    }
}
