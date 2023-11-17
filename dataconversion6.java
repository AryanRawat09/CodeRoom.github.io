public class FloatToStringExample {
    public static void main(String[] args) {
        // A sample float value
        float floatValue = 123.45f;

        // Method 1: Using String.valueOf()
        String stringValue1 = String.valueOf(floatValue);
        System.out.println("Converted String value (using String.valueOf()): " + stringValue1);

        // Method 2: Concatenating with an empty string
        String stringValue2 = floatValue + "";
        System.out.println("Converted String value (concatenating with an empty string): " + stringValue2);
    }
}
