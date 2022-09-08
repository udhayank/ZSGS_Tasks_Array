package array;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		
//		int[] arr = {3,4,2,1,7,6,5};
		int[] arr = {1,2,1,4,5,6,8,8};
		int[] res = new int[arr.length];
		
		Arrays.sort(arr);
		int mid = arr.length%2 == 0 ? arr.length/2 - 1 : arr.length/2;
		res[0] = arr[mid];
		int right = mid + 1;
		int left = mid - 1;
		for (int i=1; i<arr.length-1; i+=2) {
			res[i] = arr[right++];
			res[i+1] = arr[left--];
		}
		if (arr.length%2 == 0) {
			res[arr.length-1] = arr[right];
		}
		
		System.out.println(Arrays.toString(res));
		
	}

}
