import java.util.Scanner;

public class SparseMatrixChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrix:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns for the matrix:");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Input elements for the matrix
        System.out.println("Enter elements for the matrix:");
        inputMatrixElements(matrix, scanner);

        // Check and display whether the matrix is sparse
        boolean isSparseMatrix = isSparse(matrix);
        if (isSparseMatrix) {
            System.out.println("The matrix is a sparse matrix.");
        } else {
            System.out.println("The matrix is not a sparse matrix.");
        }

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

    // Method to check whether a matrix is a sparse matrix
    private static boolean isSparse(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Count the number of non-zero elements
        int nonZeroCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] != 0) {
                    nonZeroCount++;
                }
            }
        }

        // If the number of non-zero elements is less than half of the total elements, it is considered sparse
        return nonZeroCount < (rows * columns) / 2;
    }
}
