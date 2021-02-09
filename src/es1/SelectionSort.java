package es1;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 44, 10, 37, 99, 4, 6, 3, 2, 5, 8, 76, 4, 3, 45, 34, 34, 62, 100};
        a = selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] selectionSort(int[] v) {
        int min = 0;
        int indexOrdered = 0;
        while (!(indexOrdered == v.length - 1)) {
            min = indexOrdered;
            for (int i = indexOrdered + 1; i < v.length; i++) {
                if (v[i] >= v[min]) {
                    min = i;
                }
            }
            int temp = v[min];
            v[min] = v[indexOrdered];
            v[indexOrdered] = temp;
            indexOrdered++;
        }
        return v;
    }
}
