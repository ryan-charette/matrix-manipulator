/**
 * This class exists for testing purposes only
 */

package matrix_manipulator;

import java.util.Scanner;

public class NonRandomMatrixManipulator {
    int[][] matrix;
    int[][] exchangeMatrix;
    int size;

    public NonRandomMatrixManipulator(int n) {
	matrix = new int[n][n];
	exchangeMatrix = new int[n][n];
	size = n;

	int k = 1;
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		matrix[i][j] = k;
		k++;
	    }
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

    public int[][] verticalReflection() {
	int[][] verticalReflectionMatrix = new int[size][size];

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		for (int k = 0; k < size; k++) {
		    verticalReflectionMatrix[i][j] += matrix[k][j] * exchangeMatrix[i][k];
		}
	    }
	}
	matrix = verticalReflectionMatrix;
	return matrix;
    }

    public int[][] horizontalReflection() {
	int[][] horizontalReflectionMatrix = new int[size][size];

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		for (int k = 0; k < size; k++) {
		    horizontalReflectionMatrix[i][j] += matrix[i][k] * exchangeMatrix[k][j];
		}
	    }
	}
	matrix = horizontalReflectionMatrix;
	return matrix;
    }

    public int[][] rotateClockwise() {
	int[][] rotateMatrix = new int[size][size];

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		for (int k = 0; k < size; k++) {
		    rotateMatrix[i][j] += matrix[k][i] * exchangeMatrix[j][k];
		}
	    }
	}
	matrix = rotateMatrix;
	return matrix;
    }

    public int[][] rotateCounterClockwise() {
	int[][] reverseRotateMatrix = new int[size][size];

	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		for (int k = 0; k < size; k++) {
		    reverseRotateMatrix[i][j] += matrix[j][k] * exchangeMatrix[k][i];
		}
	    }
	}
	matrix = reverseRotateMatrix;
	return reverseRotateMatrix;
    }

    public void matrixPrinter() {
	for (int i = 0; i < size; i++) {
	    for (int j = 0; j < size; j++) {
		System.out.print(matrix[i][j]);
	    }
	    System.out.println();
	}
    }

    public static void main(String[] args) {
	Scanner sizeScanner = new Scanner(System.in);
	System.out.print("Enter matrix size: ");
	String sizeString = sizeScanner.next();
	int matrixSize = Integer.valueOf(sizeString);

	NonRandomMatrixManipulator randomMatrix = new NonRandomMatrixManipulator(matrixSize);
	randomMatrix.matrixPrinter();

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
		randomMatrix.matrixPrinter();
	    }
	    if (input.equals("2")) {
		randomMatrix.horizontalReflection();
		randomMatrix.matrixPrinter();
	    }
	    if (input.equals("3")) {
		randomMatrix.rotateClockwise();
		randomMatrix.matrixPrinter();
	    }
	    if (input.equals("4")) {
		randomMatrix.rotateCounterClockwise();
		randomMatrix.matrixPrinter();
	    }
	}
    } 
}

