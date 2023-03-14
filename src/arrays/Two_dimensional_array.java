package arrays;

public class Two_dimensional_array {

	public static void main(String[] args) {
		String[][] matrix = new String[5][5];
		for (int i = 0; i<matrix.length; i++) {
			matrix[i] = new String[]{"*","*","*","*","*"};
		}
		matrix[0] = new String[] {"*","*","*","*","*"};
		matrix[4] = matrix[0];
		for (int row=0; row <matrix.length; row++) {
			for (int col=0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

}
