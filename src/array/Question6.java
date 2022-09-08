package array;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		int n = 3; 
		
		for (int i=0; i<n; i++) {
			rightRotate(arr);
		}
		
		System.out.println(Arrays.toString(arr));

	}
	
	static void leftRotate(int[] arr) {
		
		int temp = arr[0];
		for (int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length - 1] = temp;
				
	}
	
	static void rightRotate(int[] arr) {
		
		int temp = arr[arr.length-1];
		for (int i=arr.length-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
				
	}

}
