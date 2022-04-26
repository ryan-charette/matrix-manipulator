package matrix_manipulator;

public class MatrixManipulator {
    int[][] matrix;
    int size;

    public MatrixManipulator(int n) {
	matrix = new int[n][n];
	size = n;

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		double randomDouble = 10 * Math.random();
		int randomInt = (int) randomDouble;
		matrix[i][j] = randomInt;
	    }
	}
    }

    public void upsideDown() {
	int[][] transformationMatrix = new int[size][size];

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		if (i + j == size - 1) {
		    
		}

	    }
	}
    }
}
