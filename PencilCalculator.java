package task;
import java.util.Scanner;

public class PencilCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the standard
        System.out.print("Enter the standard: ");
        int standard = scanner.nextInt();

        // Validate the standard input
        if (standard < 1 || standard > 12) {
            System.out.println("Invalid Standard");
        } else {
            // Calculate the number of pencils using the formula
            int pencils = sumOfSquares(standard);
            System.out.println("She gets " + pencils + " pencils");
        }

        scanner.close();
    }

    // Method to calculate the sum of squares of first n natural numbers
    public static int sumOfSquares(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }
}
