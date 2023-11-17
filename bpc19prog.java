import java.util.Scanner;

public class ConvertSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of seconds
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();

        // Convert seconds to hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Display the result
        System.out.println("Converted time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

        scanner.close();
    }
}
