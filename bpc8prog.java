import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a binary number
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.next();

        // Validate the binary input
        if (isValidBinary(binaryNumber)) {
            // Convert binary to decimal
            int decimalNumber = convertToDecimal(binaryNumber);

            // Display the result
            System.out.println("Decimal equivalent: " + decimalNumber);
        } else {
            System.out.println("Invalid binary number. Please enter a valid binary number.");
        }

        scanner.close();
    }

    // Method to check if a string is a valid binary number
    private static boolean isValidBinary(String binaryNumber) {
        return binaryNumber.matches("[01]+");
    }

    // Method to convert binary to decimal
    private static int convertToDecimal(String binaryNumber) {
        int decimalNumber = 0;
        int length = binaryNumber.length();

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(binaryNumber.charAt(i));
            int power = length - 1 - i;
            decimalNumber += digit * Math.pow(2, power);
        }

        return decimalNumber;
    }
}
