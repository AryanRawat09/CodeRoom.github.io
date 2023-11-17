import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Compare the numbers
        compareNumbers(num1, num2);

        scanner.close();
    }

    // Method to compare two numbers
    private static void compareNumbers(double num1, double num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
