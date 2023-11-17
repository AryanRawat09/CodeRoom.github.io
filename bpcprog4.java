import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate and display the sum
        double sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        // Calculate and display the product
        double product = num1 * num2;
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        // Calculate and display the subtraction
        double difference = num1 - num2;
        System.out.println("Difference of " + num1 + " and " + num2 + " is: " + difference);

        // Check if the second number is not zero before division
        if (num2 != 0) {
            // Calculate and display the division
            double quotient = num1 / num2;
            System.out.println("Quotient of " + num1 + " and " + num2 + " is: " + quotient);

            // Calculate and display the remainder
            double remainder = num1 % num2;
            System.out.println("Remainder of " + num1 + " divided by " + num2 + " is: " + remainder);
        } else {
            System.out.println("Cannot perform division when the second number is zero.");
        }

        scanner.close();
    }
}
