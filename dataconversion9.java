import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample {
    public static void main(String[] args) {
        // A sample string containing a date
        String dateString = "2023-11-17";

        // Define the date format
        String dateFormatPattern = "yyyy-MM-dd";
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatPattern);

        try {
            // Parse the string to a Date object
            Date convertedDate = dateFormat.parse(dateString);
            System.out.println("Converted Date: " + convertedDate);
        } catch (ParseException e) {
            System.out.println("Error: The string does not match the specified date format.");
        }
    }
}
