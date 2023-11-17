import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Calculate the sum of digits
        int sum = calculateSumOfDigits(number);

        // Display the result
        System.out.println("Sum of digits of " + number + " is: " + sum);

        scanner.close();
    }

    // Method to calculate the sum of digits of an integer
    private static int calculateSumOfDigits(int number) {
        int sum = 0;

        // Iterate through each digit
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        return sum;
    }
}
