package ru.ssau.tk.kmaster.practice.Algorithms;

import java.util.Random;

public class CompareOfSort {

    public static void main(String[] args) {
        test();
    }

    public static void quickSort(int[] arr, int from, int to) {

        if (from < to) {
            int divideIndex = partition(arr, from, to);
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

    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start,
                              int[] dest, int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }

    private static void mergeSort(int[] array) {
        int[] tmp;
        int[] currentSrc = array;
        int[] currentDest = new int[array.length];

        int size = 1;

        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size *= 2;
        }
    }

        private static void test() {
            int testLen = 100_000;

            int[] arr1 = new int[testLen];
            int[] arr2 = new int[testLen];
            int[] arr3 = new int[testLen];


            Random r = new Random();

            for (int i = 0; i < testLen; i++) {
                arr1[i] =arr2[i] = arr3[i] = r.nextInt(10000);
            }

            System.out.println("Быстрая сортировка");
            measureTime(() -> quickSort(arr1, 0, testLen - 1));

            System.out.println("Сортировка слиянием");
            measureTime(() -> mergeSort(arr2));

            System.out.println("Пузырьковая сортировка");
            measureTime(() -> bubbleSort(arr3));
        }
}