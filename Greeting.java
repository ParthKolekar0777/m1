import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask for user name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print greeting
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        // Close the scanner
        scanner.close();
    }
}
