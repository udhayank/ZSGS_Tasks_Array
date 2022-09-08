package array;

public class Question8 {

	public static void main(String[] args) {

		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{2,2,2}};
		
		System.out.println("The matrix is:");
		printMatrix(matrix);
		
		int[][] rotMatrix = rightRotate(matrix);
//		int[][] rotMatrix = leftRotate(matrix);
		
		System.out.println("The right rotated matrix is");
		printMatrix(rotMatrix);
				
	}
	
	static void printMatrix(int[][] matrix) {
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static int[][] rightRotate(int[][] matrix){
		
		int[][] rotMatrix = new int[matrix[0].length][matrix.length];
		
		for (int i=0; i<matrix[0].length; i++) {
			for(int j=0; j<matrix.length; j++) {
				rotMatrix[i][j] = matrix[matrix.length-1-j][i];
			}
		}
		
		return rotMatrix;
		
	}
	
	static int[][] leftRotate(int[][] matrix){
		
		int[][] rotMatrix = new int[matrix[0].length][matrix.length];
		
		for (int i=0; i<matrix[0].length; i++) {
			for(int j=0; j<matrix.length; j++) {
				rotMatrix[i][j] = matrix[j][matrix[0].length-1-i];
			}
		}
		
		return rotMatrix;
		
	}

}
