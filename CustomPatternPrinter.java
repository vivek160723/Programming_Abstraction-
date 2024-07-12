package task;
public class CustomPatternPrinter {
    public static void main(String[] args) {
        int n = 3;
        printCustomPattern(n);
    }
//Not giving the  desired output it is wrong  
    public static void printCustomPattern(int n) {
        int totalNumbers = n * n; // Total numbers from 1 to n^2
        
        // First line
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "*");
        }
        for (int i = totalNumbers - n + 1; i <= totalNumbers; i++) {
            System.out.print(i);
            if (i < totalNumbers) {
                System.out.print("*");
            }
        }
        System.out.println();
        
        // Second line
        for (int i = n + 1; i <= 2 * n; i++) {
            System.out.print(i + "*");
        }
        for (int i = totalNumbers - n - 1; i > totalNumbers - 2 * n + 1; i--) {
            System.out.print(i);
            if (i > totalNumbers - 2 * n + 2) {
                System.out.print("*");
            }
        }
        System.out.println();
        
        // Third line
        System.out.print(" ");
        for (int i = 2 * n + 1; i < totalNumbers - n; i++) {
            System.out.print(i);
            if (i < totalNumbers - n - 1) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
