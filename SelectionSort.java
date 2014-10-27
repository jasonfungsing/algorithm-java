import java.util.*;

public class SelectionSort {

	public static void sort(int[] a){
		int N = a.length;
		for(int i = 0; i < N; i++){
			int min = i;
			int j = i;
			for(j = i + 1; j < N; j++ ){
				if(a[j] < a[min]){
					min = j;
				}
			}
			int swap = a[i];
			a[i] = a[min];
			a[min] = swap;
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args){
		int[] a = new int[]{3,5,2,88,6,4,9};
		System.out.println("Original:");
		System.out.println(Arrays.toString(a));
		System.out.println("Start processing:");
		sort(a);
		System.out.println("Final:");
		System.out.println(Arrays.toString(a));
	}
}