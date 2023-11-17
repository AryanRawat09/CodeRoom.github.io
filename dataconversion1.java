public class StringToIntExample {
    public static void main(String[] args) {
        // A sample string containing a numeric value
        String numericString = "123";

        // Using parseInt to convert the string to an int
        try {
            int convertedInt = Integer.parseInt(numericString);
            System.out.println("Converted int value: " + convertedInt);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string does not represent a valid integer.");
        }
    }
}
