package es2;

import es1.BubbleSort;
import es1.CountingSort;
import es1.InsertionSort;
import es1.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] v = {2, 3, 4, 5, 1, 99, 232, 2, 5, 5, 4, 6, 2, 45, 45, 7, 3, 67, 6, 75, 3, 78};

        System.out.println("ARRAY DISORDINATO");

        double start = java.lang.System.nanoTime();
        BubbleSort.bubbleSort(v);
        System.out.println("Bubble sort: " + (java.lang.System.nanoTime() - start));

        start = java.lang.System.nanoTime();
        CountingSort.countingSort(v);
        System.out.println("Counting sort: " + (java.lang.System.nanoTime() - start));

        start = java.lang.System.nanoTime();
        InsertionSort.insertionSort(v);
        System.out.println("Insertion sort: " + (java.lang.System.nanoTime() - start));

        start = java.lang.System.nanoTime();
        SelectionSort.selectionSort(v);
        System.out.println("Selection sort: " + (java.lang.System.nanoTime() - start));

        System.out.println();
        System.out.println("ARRAY PARZIALMENTE ORDINATO");
        int [] v2 = {1, 2, 3, 4, 6, 10, 12, 13, 14, 15, 20, 6, 2, 45, 45, 7, 3, 67, 6, 75, 3, 78};
        start = java.lang.System.nanoTime();
        BubbleSort.bubbleSort(v2);
        System.out.println("Bubble sort: " + (java.lang.System.nanoTime() - start));

        start = java.lang.System.nanoTime();
        CountingSort.countingSort(v2);
        System.out.println("Counting sort: " + (java.lang.System.nanoTime() - start));

        start = java.lang.System.nanoTime();
        InsertionSort.insertionSort(v2);
        System.out.println("Insertion sort: " + (java.lang.System.nanoTime() - start));

        start = java.lang.System.nanoTime();
        SelectionSort.selectionSort(v2);
        System.out.println("Selection sort: " + (java.lang.System.nanoTime() - start));

        System.out.println();
        System.out.println("ARRAY ORDINATO AL CONTRARIO");
        int [] v3 = {20,19,18,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
        start = java.lang.System.nanoTime();
        BubbleSort.bubbleSort(v3);
        System.out.println("Bubble sort: " + (java.lang.System.nanoTime() - start));

        start = java.lang.System.nanoTime();
        CountingSort.countingSort(v3);
        System.out.println("Counting sort: " + (java.lang.System.nanoTime() - start));

        start = java.lang.System.nanoTime();
        InsertionSort.insertionSort(v3);
        System.out.println("Insertion sort: " + (java.lang.System.nanoTime() - start));

        start = java.lang.System.nanoTime();
        SelectionSort.selectionSort(v3);
        System.out.println("Selection sort: " + (java.lang.System.nanoTime() - start));

    }
}
