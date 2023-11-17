import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the values of two variables
        System.out.print("Enter the value of the first variable: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of the second variable: ");
        int b = scanner.nextInt();

        // Display the values before swapping
        System.out.println("Before swapping: ");
        System.out.println("First variable (a) = " + a);
        System.out.println("Second variable (b) = " + b);

        // Swap the values
        int temp = a;
        a = b;
        b = temp;

        // Display the values after swapping
        System.out.println("After swapping: ");
        System.out.println("First variable (a) = " + a);
        System.out.println("Second variable (b) = " + b);

        scanner.close();
    }
}
