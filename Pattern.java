package task;
public class Pattern {
    public static void main(String[] args) {
        // Example input
        int n = 3;
        
        // Print the pattern
        printPattern(n);
    }

    public static void printPattern(int n) {
        // Part 1: Increasing sequence
        for (int i = 1; i <= n; i++) {
            printAsterisks(i);
        }
        
        // Part 2: Decreasing sequence
        for (int i = n - 1; i >= 1; i--) {
            printAsterisks(i);
        }
    }

    // Helper method to print a specific number of asterisks
    public static void printAsterisks(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
