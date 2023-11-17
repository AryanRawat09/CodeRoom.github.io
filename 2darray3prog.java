import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the first matrix:");
        int rows1 = scanner.nextInt();

        System.out.println("Enter the number of columns for the first matrix:");
        int columns1 = scanner.nextInt();

        System.out.println("Enter the number of rows for the second matrix:");
        int rows2 = scanner.nextInt();

        System.out.println("Enter the number of columns for the second matrix:");
        int columns2 = scanner.nextInt();

        // Check if multiplication is possible
        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns in the first matrix "
                    + "must be equal to the number of rows in the second matrix.");
            return;
        }

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];
        int[][] resultMatrix = new int[rows1][columns2];

        // Input elements for the first matrix
        System.out.println("Enter elements for the first matrix:");
        inputMatrixElements(matrix1, scanner);

        // Input elements for the second matrix
        System.out.println("Enter elements for the second matrix:");
        inputMatrixElements(matrix2, scanner);

        // Multiply matrices
        multiplyMatrices(matrix1, matrix2, resultMatrix);

        // Print the result matrix
        System.out.println("Resultant Matrix after multiplication:");
        printMatrix(resultMatrix);

        scanner.close();
    }

    // Method to input elements for a matrix
    private static void inputMatrixElements(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to multiply two matrices
    private static void multiplyMatrices(int[][] matrix1, int[][] matrix2, int[][] resultMatrix) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
