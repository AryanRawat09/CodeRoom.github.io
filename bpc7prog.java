import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to binary
        String binaryNumber = convertToBinary(decimalNumber);

        // Display the result
        System.out.println("Binary equivalent: " + binaryNumber);

        scanner.close();
    }

    // Method to convert decimal to binary
    private static String convertToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        while (decimalNumber > 0) {
            // Get the remainder when dividing by 2
            int remainder = decimalNumber % 2;

            // Prepend the remainder to the binary representation
            binary.insert(0, remainder);

            // Divide the number by 2
            decimalNumber /= 2;
        }

        // If the input decimal number is 0, the binary representation is "0"
        if (binary.length() == 0) {
            binary.append(0);
        }

        return binary.toString();
    }
}
