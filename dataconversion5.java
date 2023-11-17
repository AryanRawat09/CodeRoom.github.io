public class StringToFloatExample {
    public static void main(String[] args) {
        // A sample string containing a floating-point value
        String floatString = "123.45";

        // Method 1: Using Float.parseFloat()
        try {
            float convertedFloat1 = Float.parseFloat(floatString);
            System.out.println("Converted float value (using Float.parseFloat()): " + convertedFloat1);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string does not represent a valid float.");
        }

        // Method 2: Using Float.valueOf()
        try {
            float convertedFloat2 = Float.valueOf(floatString);
            System.out.println("Converted float value (using Float.valueOf()): " + convertedFloat2);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string does not represent a valid float.");
        }
    }
}
