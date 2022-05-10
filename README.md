# matrix-manipulator
This program is intended to demonstrate the key concepts and takeaways from a programming assignment completed for a university course. While the idea behind this project is inspired by the original assignment, the execution is entirely different. There are no commonalities between this code and my solution to the university assignment; it is not reasonably possible to derive a solution to the original assignment, in part or in whole, from this code.

This program creates a square matrix of dimensions *n* and fills it with random integers from 1-9. The user can then apply various transformations to the matrix. Transformations are done through algebraic matrix operations using an [exchange matrix](https://en.wikipedia.org/wiki/Exchange_matrix). From an algorithmic standpoint, this implementation is incredibly inefficient. I decided on this implementation for two reasons. First and foremost, I thought it was an interesting approach to the problem, being inspired by the mathematical properties of matrices rather than the computational properties of multidimensional arrays. Second, this implementation is not a remotely possible solution to the original assignment, so it helps me ensure further compliance with academic integrity policy.

---

This project deals with matrices. A matrix is a 2D-array, and the program consists of operations to transform a matrix. In particular, we are interested in rotating and reflecting the matrix. 

The class MatrixManipulator has the following instance variables:

1. int[][] matrix
2. int[][] exchangeMatrix
3. int size
    
### Constructor:

MatrixManipulator has a constructor. It sets the size of the matrix fills it with random integers 1-9. Lastly, it creates an equally sized exchange matrix.

### Methods

**int[][] verticalReflection()**

This method reflects the matrix along the x-axis. For example, the matrix
~~~
1 2 3
4 5 6
7 8 9
~~~
becomes
~~~
7 8 9
4 5 6
1 2 3
~~~
**int[][] horizontalReflection()**

This method reflects the matrix along the y-axis. For example, the matrix
~~~
1 2 3
4 5 6
7 8 9
~~~
becomes
~~~
3 2 1
6 5 4
9 8 7
~~~

**int[][] rotateClockwise()**

This method rotates the matrix 90 degrees clockwise. For example, the matrix
~~~
1 2 3
4 5 6
7 8 9
~~~
becomes
~~~
7 4 1
8 5 2
9 6 3
~~~

**int[][] rotateCounterClockwise()**

This method rotates the matrix 90 degrees counter-clockwise. For example, the matrix
~~~
1 2 3
4 5 6
7 8 9
~~~
becomes
~~~
3 6 9
2 5 8
1 4 7
~~~

**void matrixPrinter()**

This method prints the matrix to the console. 

---

The program runs in the console, so if you'd like to test out the code, simply open the file in an IDE and run it. Enter an integer to define the dimensions of the matrix. The matrix will always be square. Next, select a transformation by inputting the integer corresponding to the transformation. 

Also, note that there is currently no error-catching on the inputs. Please only enter integers greater than 2 for the dimensions and integers 1-4 for the transformations. This is something that I intend to fix in a future version.
