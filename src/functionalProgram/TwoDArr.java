package functionalProgram;

public class TwoDArr {
	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int [] [] array = new int [row] [col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();

		}

	}
	
}
