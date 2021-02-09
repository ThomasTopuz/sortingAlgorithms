package es1;

public class CountingSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 44, 10, 37, 99, 4, 6, 3, 2, 5, 8, 76, 4, 3, 45, 34, 34, 62, 100};
        a = countingSort(a);
        print(a);
    }

    public static int[] countingSort(int[] v) {
        int max = v[0];
        for (int i = 0; i < v.length; i++) {
            if (max < v[i]) {
                max = v[i];
            }
        }

        int[] recurr = new int[max + 1];
        for (int i = 0; i < v.length; i++) {
            recurr[v[i]]++;
        }
        int[] sorted = new int[v.length];
        int c = 0;
        for (int i = 0; i < recurr.length; i++) {
            while (recurr[i] > 0) {
                sorted[c] = i;
                c++;
                recurr[i]--;
            }
        }
        return sorted;
    }

    private static void print(int[] recurr) {
        for (int i = 0; i < recurr.length; i++) {
            System.out.print(recurr[i] + " ");
        }
        System.out.println();
    }
}
