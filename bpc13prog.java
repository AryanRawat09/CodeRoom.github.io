import java.util.Scanner;

public class AsciiValueOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Print the ASCII value
        printAsciiValue(inputChar);

        scanner.close();
    }

    // Method to print the ASCII value of a character
    private static void printAsciiValue(char ch) {
        int asciiValue = (int) ch;
        System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
