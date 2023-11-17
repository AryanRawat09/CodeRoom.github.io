import java.util.Scanner;

public class SumOfRowsAndColumns {

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

        // Calculate and display the sum of each row and each column
        calculateAndDisplaySum(matrix);

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

    // Method to calculate and display the sum of each row and each column
    private static void calculateAndDisplaySum(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Calculate and display the sum of each row
        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < columns; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // Calculate and display the sum of each column
        System.out.println("Sum of each column:");
        for (int j = 0; j < columns; j++) {
            int columnSum = 0;
            for (int i = 0; i < rows; i++) {
                columnSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + columnSum);
        }
    }
}
