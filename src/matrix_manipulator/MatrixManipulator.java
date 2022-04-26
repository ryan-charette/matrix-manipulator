package matrix_manipulator;

import java.util.Scanner;

public class MatrixManipulator {
    int[][] matrix;
    int[][] exchangeMatrix;
    int size;

    public MatrixManipulator(int n) {
	matrix = new int[n][n];
	exchangeMatrix = new int[n][n];
	size = n;

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		double randomDouble = 9 * Math.random() + 1;
		int randomInt = (int) randomDouble;
		matrix[i][j] = randomInt;
		System.out.print(matrix[i][j]);
	    }
	    System.out.println();
	}

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		if (i + j == size - 1) {
		    exchangeMatrix[i][j] = 1;
		}
		else {
		    exchangeMatrix[i][j] = 0;
		}
	    }
	}
    }

    public void verticalReflection() {
	int[][] verticalReflectionMatrix = new int[size][size];

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		for (int k = 0; k < size; k++) {
		    verticalReflectionMatrix[i][j] += matrix[k][j] * exchangeMatrix[i][k];
		}
		System.out.print(verticalReflectionMatrix[i][j]);
	    }
	    System.out.println();
	}
    }

    public void horizontalReflection() {
	int[][] horizontalReflectionMatrix = new int[size][size];

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		for (int k = 0; k < size; k++) {
		    horizontalReflectionMatrix[i][j] += matrix[i][k] * exchangeMatrix[k][j];
		}
		System.out.print(horizontalReflectionMatrix[i][j]);
	    }
	    System.out.println();
	}
    }

    public void rotateClockwise() {
	int[][] rotateMatrix = new int[size][size];

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		for (int k = 0; k < size; k++) {
		    rotateMatrix[i][j] += matrix[k][i] * exchangeMatrix[j][k];
		}
		System.out.print(rotateMatrix[i][j]);
	    }
	    System.out.println();
	}
    }
    
    public void rotateCounterClockwise() {
	int[][] reverseRotateMatrix = new int[size][size];

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		for (int k = 0; k < size; k++) {
		    reverseRotateMatrix[i][j] += matrix[j][k] * exchangeMatrix[k][i];
		}
		System.out.print(reverseRotateMatrix[i][j]);
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args) {
	Scanner sizeScanner = new Scanner(System.in);
	System.out.print("Enter matrix size: ");
	String sizeString = sizeScanner.next();
	int matrixSize = Integer.valueOf(sizeString);

	MatrixManipulator randomMatrix = new MatrixManipulator(matrixSize);

	while (true) {
	    System.out.println("Select a transformation");
	    System.out.println("[1] Vertical Reflection");
	    System.out.println("[2] Horizontal Reflection");
	    System.out.println("[3] Rotate Clockwise");
	    System.out.println("[4] Rotate Counter-clockwise");

	    Scanner scanner = new Scanner(System.in);
	    String input = scanner.next();
	    if (input.equals("1")) {
		randomMatrix.verticalReflection();
	    }
	    if (input.equals("2")) {
		randomMatrix.horizontalReflection();
	    }
	    if (input.equals("3")) {
		randomMatrix.rotateClockwise();
	    }
	    if (input.equals("4")) {
		randomMatrix.rotateCounterClockwise();
	    }
	}
    } 
}

