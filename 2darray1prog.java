import java.util.Scanner;

public class MatrixInputAndPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrix:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns for the matrix:");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print matrix in matrix format
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Move to the next line for the next row
        }

        scanner.close();
    }
}
