package ru.ssau.tk.kmaster.practice.StudyPractice.Collections.ArrayListCopy;

public interface MyList<T> extends Iterable<T> {

    void add(T t);

    void delete(int index);

    T get(int index);

    int size();

    void update(int index, T t);
}
