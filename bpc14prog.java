import java.util.Scanner;

public class ComputeExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        // Compute the expression n + nn + nnn
        int result = n + (n * 10 + n) + (n * 100 + n * 10 + n);

        // Display the result
        System.out.println("Result of " + n + " + " + (n * 10 + n) + " + " + (n * 100 + n * 10 + n) + " is: " + result);

        scanner.close();
    }
}
