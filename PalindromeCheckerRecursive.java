package task;

import java.util.Scanner;

public class PalindromeCheckerRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Reverse the number using recursion
        int reversedNumber = reverseNumberRecursive(number, 0);
        
        // Check if the original number and reversed number are the same
        if (number == reversedNumber) {
            System.out.println("It is a palindrome number.");
        } else {
            System.out.println("It is not a palindrome number.");
        }
        
        scanner.close();
    }
    
    // Method to reverse a number recursively
    public static int reverseNumberRecursive(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        return reverseNumberRecursive(num / 10, reversed);
    }
}
