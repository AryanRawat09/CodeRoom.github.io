import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the product
        double product = num1 * num2;

        // Display the result
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        scanner.close();
    }
}
