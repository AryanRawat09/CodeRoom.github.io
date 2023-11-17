public class IntToStringExample {
    public static void main(String[] args) {
        // Method 1: Using String.valueOf()
        int intValue = 123;
        String stringValue1 = String.valueOf(intValue);
        System.out.println("Converted String value (using String.valueOf()): " + stringValue1);

        // Method 2: Concatenating with an empty string
        String stringValue2 = intValue + "";
        System.out.println("Converted String value (concatenating with an empty string): " + stringValue2);
    }
}
