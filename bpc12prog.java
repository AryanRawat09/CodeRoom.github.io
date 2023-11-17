import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Count the characters
        countCharacters(inputString);

        scanner.close();
    }

    // Method to count letters, spaces, numbers, and other characters
    private static void countCharacters(String inputString) {
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }

        // Display the result
        System.out.println("Letter count: " + letterCount);
        System.out.println("Number count: " + numberCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Other character count: " + otherCount);
    }
}
