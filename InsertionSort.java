import java.util.*;

public class InsertionSort {

    public static void insertionSort(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            int k = i;
            for (int j = k - 1; j >= 0; j--) {
                if (a[k] < a[j]) {
                    int swap = a[k];
                    a[k] = a[j];
                    a[j] = swap;
                    k--;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {3, 5, 2, 88, 6, 4, 9};
        System.out.println("Original:");
        System.out.println(Arrays.toString(a));
        System.out.println("Start processing:");
        insertionSort(a);
        System.out.println("Final:");
        System.out.println(Arrays.toString(a));
    }
}