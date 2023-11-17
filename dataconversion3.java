public class StringToLongExample {
    public static void main(String[] args) {
        // A sample string containing a numeric value
        String numericString = "1234567890";

        // Method 1: Using Long.parseLong()
        try {
            long convertedLong1 = Long.parseLong(numericString);
            System.out.println("Converted long value (using Long.parseLong()): " + convertedLong1);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string does not represent a valid long.");
        }

        // Method 2: Using Long.valueOf()
        try {
            long convertedLong2 = Long.valueOf(numericString);
            System.out.println("Converted long value (using Long.valueOf()): " + convertedLong2);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string does not represent a valid long.");
        }
    }
}
