package task;
import java.util.Scanner;

public class Fibonacci {
    // Recursive method to calculate Fibonacci value
    public static int fibonacci(int n) {
        if (n <= 1) { // Base case
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting user input
        System.out.print("Enter a number to show the series of Fibonacci values: ");
        int number = scanner.nextInt();

        // Printing the Fibonacci series
        System.out.println("Fibonacci series up to " + number + " terms:");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
            scanner.close();
        }
    }
}
