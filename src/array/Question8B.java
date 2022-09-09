package array;

import java.util.Arrays;

public class Question8B {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		// inplace works only with square matrix
//		transpose(matrix);
		rightRotate(matrix);
		
		for (int[] a:matrix) {
			System.out.println(Arrays.toString(a));
		}

	}
	
	static void rightRotate(int[][] matrix) {
		
		transpose(matrix);
		
		for (int[] arr:matrix) {
			reverseWithRecursion(arr);
		}
		
	}
	
	static void transpose(int[][] matrix) {
		
		int temp;
		
		for (int i=0; i<matrix.length-1; i++) {
			for (int j=i+1; j<matrix[0].length; j++) {
				
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
				
			}
		}
		
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
