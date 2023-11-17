import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrices:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns for the matrices:");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];

        // Input elements for the first matrix
        System.out.println("Enter elements for the first matrix:");
        inputMatrixElements(matrix1, scanner);

        // Input elements for the second matrix
        System.out.println("Enter elements for the second matrix:");
        inputMatrixElements(matrix2, scanner);

        // Add matrices
        addMatrices(matrix1, matrix2, resultMatrix);

        // Print the result matrix
        System.out.println("Resultant Matrix after addition:");
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

    // Method to add two matrices
    private static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] resultMatrix) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
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
