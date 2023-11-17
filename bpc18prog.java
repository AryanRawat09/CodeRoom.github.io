import java.util.Scanner;

public class StringToIntegerConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a number as a string: ");
        String inputString = scanner.nextLine();

        try {
            // Convert the string to an integer
            int convertedNumber = Integer.parseInt(inputString);

            // Display the result
            System.out.println("Converted integer: " + convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input is not a valid integer.");
        }

        scanner.close();
    }
}
