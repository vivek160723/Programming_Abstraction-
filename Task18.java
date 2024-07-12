package task;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of elements
        int N = scanner.nextInt();
        int[] inputArray = new int[N];
        
        // Read the elements into the input array
        for (int i = 0; i < N; i++) {
            inputArray[i] = scanner.nextInt();
        }
        
        // Calculate the sum of the squares of all elements
        int totalSumOfSquares = 0;
        for (int i = 0; i < N; i++) {
            totalSumOfSquares += inputArray[i] * inputArray[i];
        }
        
        // Create the output array
        int[] outputArray = new int[N];
        for (int i = 0; i < N; i++) {
            outputArray[i] = totalSumOfSquares - inputArray[i] * inputArray[i];
        }
        
        // Print the total sum of squares
        System.out.println(totalSumOfSquares);
        
        // Print the output array
        for (int value : outputArray) {
            System.out.print(value + " ");
        }
        
        scanner.close();
    }
}
