import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateToStringExample {
    public static void main(String[] args) {
        // A sample LocalDate object
        LocalDate currentDate = LocalDate.now();

        // Define the date format
        String dateFormatPattern = "yyyy-MM-dd";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormatPattern);

        // Format the LocalDate object to a String
        String dateString = currentDate.format(formatter);

        System.out.println("Converted String: " + dateString);
    }
}
