package matrix_manipulator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NonRandomMatrixManipulatorTest {
    NonRandomMatrixManipulator matrixTest;

    @BeforeEach
    void setUp() throws Exception {
	matrixTest = new NonRandomMatrixManipulator(3);
    }

    @Test
    void testNonRandomMatrixManipulator() {
	assertEquals(matrixTest.size, 3);
	assertEquals(matrixTest.matrix[0][0], 1);
	assertEquals(matrixTest.matrix[0][1], 2);
	assertEquals(matrixTest.matrix[0][2], 3);
	assertEquals(matrixTest.matrix[1][0], 4);
	assertEquals(matrixTest.matrix[1][1], 5);
	assertEquals(matrixTest.matrix[1][2], 6);
	assertEquals(matrixTest.matrix[2][0], 7);
	assertEquals(matrixTest.matrix[2][1], 8);
	assertEquals(matrixTest.matrix[2][2], 9);
	
	assertEquals(matrixTest.exchangeMatrix[0][0], 0);
	assertEquals(matrixTest.exchangeMatrix[0][1], 0);
	assertEquals(matrixTest.exchangeMatrix[0][2], 1);
	assertEquals(matrixTest.exchangeMatrix[1][0], 0);
	assertEquals(matrixTest.exchangeMatrix[1][1], 1);
	assertEquals(matrixTest.exchangeMatrix[1][2], 0);
	assertEquals(matrixTest.exchangeMatrix[2][0], 1);
	assertEquals(matrixTest.exchangeMatrix[2][1], 0);
	assertEquals(matrixTest.exchangeMatrix[2][2], 0);
    }
    
    @Test
    void testVerticalReflection() {
	matrixTest.verticalReflection();
	assertEquals(matrixTest.matrix[0][0], 7);
	assertEquals(matrixTest.matrix[0][1], 8);
	assertEquals(matrixTest.matrix[0][2], 9);
	assertEquals(matrixTest.matrix[1][0], 4);
	assertEquals(matrixTest.matrix[1][1], 5);
	assertEquals(matrixTest.matrix[1][2], 6);
	assertEquals(matrixTest.matrix[2][0], 1);
	assertEquals(matrixTest.matrix[2][1], 2);
	assertEquals(matrixTest.matrix[2][2], 3);
    }
    
    @Test
    void testHorizontalReflection() {
	matrixTest.horizontalReflection();
	assertEquals(matrixTest.matrix[0][0], 3);
	assertEquals(matrixTest.matrix[0][1], 2);
	assertEquals(matrixTest.matrix[0][2], 1);
	assertEquals(matrixTest.matrix[1][0], 6);
	assertEquals(matrixTest.matrix[1][1], 5);
	assertEquals(matrixTest.matrix[1][2], 4);
	assertEquals(matrixTest.matrix[2][0], 9);
	assertEquals(matrixTest.matrix[2][1], 8);
	assertEquals(matrixTest.matrix[2][2], 7);
    }
    
    @Test
    void testRotateClockwise() {
	matrixTest.rotateClockwise();
	assertEquals(matrixTest.matrix[0][0], 7);
	assertEquals(matrixTest.matrix[0][1], 4);
	assertEquals(matrixTest.matrix[0][2], 1);
	assertEquals(matrixTest.matrix[1][0], 8);
	assertEquals(matrixTest.matrix[1][1], 5);
	assertEquals(matrixTest.matrix[1][2], 2);
	assertEquals(matrixTest.matrix[2][0], 9);
	assertEquals(matrixTest.matrix[2][1], 6);
	assertEquals(matrixTest.matrix[2][2], 3);
    }
    
    @Test
    void testRotateCounterClockwise() {
	matrixTest.rotateCounterClockwise();
	assertEquals(matrixTest.matrix[0][0], 3);
	assertEquals(matrixTest.matrix[0][1], 6);
	assertEquals(matrixTest.matrix[0][2], 9);
	assertEquals(matrixTest.matrix[1][0], 2);
	assertEquals(matrixTest.matrix[1][1], 5);
	assertEquals(matrixTest.matrix[1][2], 8);
	assertEquals(matrixTest.matrix[2][0], 1);
	assertEquals(matrixTest.matrix[2][1], 4);
	assertEquals(matrixTest.matrix[2][2], 7);
    }

}
