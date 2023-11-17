import java.util.Scanner;

public class FrequencyOfOddEvenNumbers {

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

        // Calculate and display the frequency of odd and even numbers
        calculateAndDisplayFrequency(matrix);

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

    // Method to calculate and display the frequency of odd and even numbers
    private static void calculateAndDisplayFrequency(int[][] matrix) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Frequency of even numbers: " + evenCount);
        System.out.println("Frequency of odd numbers: " + oddCount);
    }
}
