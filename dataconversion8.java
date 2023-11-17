public class DoubleToStringExample {
    public static void main(String[] args) {
        // A sample double value
        double doubleValue = 123.45;

        // Method 1: Using String.valueOf()
        String stringValue1 = String.valueOf(doubleValue);
        System.out.println("Converted String value (using String.valueOf()): " + stringValue1);

        // Method 2: Concatenating with an empty string
        String stringValue2 = doubleValue + "";
        System.out.println("Converted String value (concatenating with an empty string): " + stringValue2);
    }
}
