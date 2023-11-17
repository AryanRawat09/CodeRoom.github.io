import java.util.Scanner;

public class IdentityMatrixChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the order (number of rows and columns) of the square matrix:");
        int order = scanner.nextInt();

        int[][] matrix = new int[order][order];

        // Input elements for the square matrix
        System.out.println("Enter elements for the square matrix:");
        inputSquareMatrixElements(matrix, scanner);

        // Check and display whether the matrix is an identity matrix
        boolean isIdentityMatrix = isIdentity(matrix);
        if (isIdentityMatrix) {
            System.out.println("The matrix is an identity matrix.");
        } else {
            System.out.println("The matrix is not an identity matrix.");
        }

        scanner.close();
    }

    // Method to input elements for a square matrix
    private static void inputSquareMatrixElements(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to check whether a matrix is an identity matrix
    private static boolean isIdentity(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Check if the matrix is square
        if (rows != columns) {
            return false;
        }

        // Check if all diagonal elements are 1 and others are 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    return false;
                }
            }
        }

        return true;
    }
}
