public class StringToDoubleExample {
    public static void main(String[] args) {
        // A sample string containing a floating-point value
        String doubleString = "123.45";

        // Method 1: Using Double.parseDouble()
        try {
            double convertedDouble1 = Double.parseDouble(doubleString);
            System.out.println("Converted double value (using Double.parseDouble()): " + convertedDouble1);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string does not represent a valid double.");
        }

        // Method 2: Using Double.valueOf()
        try {
            double convertedDouble2 = Double.valueOf(doubleString);
            System.out.println("Converted double value (using Double.valueOf()): " + convertedDouble2);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string does not represent a valid double.");
        }
    }
}
