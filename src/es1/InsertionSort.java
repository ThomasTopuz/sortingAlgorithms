package es1;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 44, 10, 37, 99, 4, 6, 3, 2, 5, 8, 76, 4, 3, 45, 34, 34, 62, 100};
        a = insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] insertionSort(int[] v) {
        int indexDisordered = 1;
        while (indexDisordered < v.length) {
            for (int i = indexDisordered; i < v.length; i++) {
                int currPos = i;
                int j = i - 1;
                while (v[j] < v[currPos]) {
                    int temp = v[currPos];
                    v[currPos] = v[j];
                    v[j] = temp;
                    currPos = j;
                    if (!(j - 1 < 0)) {
                        j--;
                    }
                }
            }
            indexDisordered++;
        }

        return v;
    }
}
