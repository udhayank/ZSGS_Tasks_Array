package array;

public class Question9 {

	public static void main(String[] args) {
		
//		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix = {{1,2,3,4},{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		printSpiral(matrix);

	}
	
	static void printSpiral(int[][] matrix) {
		
		int top = 0;
		int right = matrix[0].length;
		int left = 0;
		int bottom = matrix.length;
		
		int i=0, j=0;
				
		while(top < bottom && left < right) {
			
			for (j=left; j<right; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			j--;
			top++;
			
			for (i=top; i<bottom; i++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			i--;
			right--;
			
			for (j=right-1; j>=left; j--) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			j++;
			bottom--;
			
			for (i=bottom-1; i>=top; i--) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			i++;
			left++;
			
		}		

	}

}
