package task;
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        
        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
        
        scanner.close();
    }
    
    public static boolean isValidPassword(String password) {
        // Check length
        if (password.length() != 8) {
            return false;
        }
        
        // Check if password consists of only letters and digits
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        
        // Check if password consists of at least two digits
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        
        return digitCount >= 2;
    }
}
