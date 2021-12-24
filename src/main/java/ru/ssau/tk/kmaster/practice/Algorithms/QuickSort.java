package ru.ssau.tk.kmaster.practice.Algorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

        //int[] array = new int[]{58, 29, 85, 41, 23, 35, 61, 42, 75, 24, 47, 55, 63};
        //System.out.println("Source array: " + arrayToString(array) + "\n");
        //quickSort(array, 0, array.length - 1);
        //System.out.println("Quick sort array: " + arrayToString(array));
        test();
    }

    public static void quickSort(int[] arr, int from, int to) {

        if (from < to) {
            int divideIndex = partition(arr, from, to);
            //printSortStep(arr, from, to, divideIndex);
            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.print(arrayToString(arr));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + arrayToString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", right: " + arrayToString(Arrays.copyOfRange(arr, partitionIndex, to + 1)) + "\n");
    }

    private static void bubbleSort(int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                    sorted = false;
                }
            }
        }
    }

    private static void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println("Затраченное время: " + elapsed + " ms");
    }

    private static void test() {
        int testLen = 100_000;

        int[] arr1 = new int[testLen];
        int[] arr2 = new int[testLen];

        Random r = new Random();

        for (int i = 0; i < testLen; i++) {
            arr1[i] = arr2[i] = r.nextInt(10000);
        }

        System.out.println("Быстрая сортировка");
        measureTime(() -> quickSort(arr1, 0, testLen - 1));

        System.out.println("Пузырьковая сортировка");
        measureTime(() -> bubbleSort(arr2));
    }
}