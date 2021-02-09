package ES3;

import java.util.HashMap;
import java.util.Map;

public class MergeSort {
    //preso da github
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 44, 10, 37, 99, 4, 6, 3, 2, 5, 8, 76, 4, 3, 45, 34, 34, 62, 100};
        sort(a);
        for(int i = 0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void sort(int[] a) {
        int[] helper = new int[a.length];
        sort(a, 0, a.length - 1, helper);
        Map map = new HashMap<>();
    }

    private static void sort(int[] a, int lo, int hi, int[] helper) {
        if (lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid, helper);
        sort(a, mid + 1, hi, helper);
        merge(a, lo, mid, hi, helper);
    }

    private static void merge(int[] a, int lo, int mid, int hi, int[] helper) {

        for (int i = lo; i <= hi; i++) helper[i] = a[i];
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = helper[j++];
            else if (j > hi)
                a[k] = helper[i++];
            else if (helper[i] <= helper[j])
                a[k] = helper[i++];
            else
                a[k] = helper[j++];
        }

    }

}
