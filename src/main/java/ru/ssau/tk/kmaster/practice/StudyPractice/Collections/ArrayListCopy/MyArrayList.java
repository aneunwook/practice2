package ru.ssau.tk.kmaster.practice.StudyPractice.Collections.ArrayListCopy;

import java.util.Collection;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {

    private T[] array;

    public MyArrayList() {
        array = (T[]) new Object[0];
    }

    public MyArrayList(Collection<? extends T> arr) {
        Object[] a = arr.toArray();
        array = (T[]) a;
    }

    @Override
    public void add(T t) {
        try {
            T[] temp = array;
            array = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, array, 0, temp.length);
            array[array.length - 1] = t;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(int index) {
        try {
            T[] temp = array;
            array = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, array, 0, index);
            int amountElAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, array, index, amountElAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void update(int index, T t) {
        array[index] = t;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(array);
    }
}
