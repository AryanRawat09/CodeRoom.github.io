public class LongToStringExample {
    public static void main(String[] args) {
        // A sample long value
        long longValue = 1234567890L;

        // Method 1: Using String.valueOf()
        String stringValue1 = String.valueOf(longValue);
        System.out.println("Converted String value (using String.valueOf()): " + stringValue1);

        // Method 2: Concatenating with an empty string
        String stringValue2 = longValue + "";
        System.out.println("Converted String value (concatenating with an empty string): " + stringValue2);
    }
}
