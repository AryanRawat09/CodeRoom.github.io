import java.util.Scanner;

public class LowerTriangularMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the order (number of rows and columns) of the square matrix:");
        int order = scanner.nextInt();

        int[][] matrix = new int[order][order];

        // Input elements for the square matrix
        System.out.println("Enter elements for the square matrix:");
        inputSquareMatrixElements(matrix, scanner);

        // Display the lower triangular matrix
        System.out.println("Lower Triangular Matrix:");
        displayLowerTriangularMatrix(matrix);

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

    // Method to display the lower triangular matrix
    private static void displayLowerTriangularMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j <= i) {
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    System.out.print("0\t"); // Replace elements above the main diagonal with zeros
                }
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
