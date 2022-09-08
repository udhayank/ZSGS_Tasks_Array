package array;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		reverseWithRecursion(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void reverseWithRecursion(int[] arr) {
		reverseWithRecursion(arr, 0, arr.length-1);
	}
	
	static void reverseWithRecursion(int[] arr, int start, int end) {
		if (end - start <= 1) {
			return;
		}
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseWithRecursion(arr, start+1, end-1);
	}

}
