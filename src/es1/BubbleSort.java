package es1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 44, 10, 37, 99, 4, 6, 3, 2, 5, 8, 76, 4, 3, 45, 34, 34, 62, 100};
        a = bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] bubbleSort(int[] v) {
        boolean sorted = isSorted(v);
        int len = v.length;
        while (!sorted) {
            for (int i = 0; i < len; i++) {
                try {
                    if (v[i] > v[i + 1]) {
                        int temp = v[i];
                        v[i] = v[i + 1];
                        v[i + 1] = temp;
                    }
                } catch (Exception e) {
                }
            }
            if (isSorted(v)) {
                sorted = true;
            }
        }
        return v;
    }

    public static boolean isSorted(int[] v) {
        boolean sorted = true;
        for (int i = 0; i < v.length; i++) {
            try {
                if (!(v[i] <= v[i + 1])) {
                    sorted = false;
                }
            } catch (Exception e) {
            }
        }
        return sorted;
    }
}
