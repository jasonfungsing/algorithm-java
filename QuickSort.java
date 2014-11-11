import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {32, 5, 4, 78, 9, 87, 12, 54, 34, 98};
        quickSort(a);
    }

    public static int[] quickSort(int[] a) {
        // Array.shuffle(a);
        sort(a, 0, a.length - 1);

        return a;
    }

    public static int partition(int[] a, int lo, int hi) {
        int k = lo;
        lo++;

        while (lo < hi) {
            if (a[lo] < a[k]) {
                lo++;
                continue;
            }
            if (a[hi] > a[k]) {
                hi--;
                continue;
            }

            int swap = a[lo];
            a[lo] = a[hi];
            a[hi] = swap;
            lo++;
            hi--;
        }

        int swap = a[lo - 1];
        a[lo - 1] = a[k];
        a[k] = swap;

        return hi;
    }

    public static void sort(int[] a, int lo, int hi) {
        System.out.println("Current lo: \t" + lo + " and hi: \t" + hi + " with array ----> " + Arrays.toString(a));
        
        if (hi <= lo + 1) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j);
        sort(a, j, hi);
    }
}