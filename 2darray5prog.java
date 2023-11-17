import java.util.Scanner;

public class MatrixEquality {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrices:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns for the matrices:");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        // Input elements for the first matrix
        System.out.println("Enter elements for the first matrix:");
        inputMatrixElements(matrix1, scanner);

        // Input elements for the second matrix
        System.out.println("Enter elements for the second matrix:");
        inputMatrixElements(matrix2, scanner);

        // Check if matrices are equal
        boolean areEqual = areMatricesEqual(matrix1, matrix2);

        // Print the result
        if (areEqual) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.");
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

    // Method to check if two matrices are equal
    private static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false; // Matrices have different dimensions
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false; // Matrices have different elements
                }
            }
        }

        return true; // Matrices are equal
    }
}
