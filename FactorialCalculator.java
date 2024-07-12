package task;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate the factorial using recursion
        long factorial = factorialRecursive(number);
        
        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
    
    // Recursive method to calculate factorial
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1; // Base case: 0! = 1 and 1! = 1
        } else {
            return n * factorialRecursive(n - 1); // Recursive case
        }
    }
}
