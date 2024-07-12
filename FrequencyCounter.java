package task;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the number to find its frequency
        System.out.print("Enter the number to find its frequency: ");
        int num = scanner.nextInt();

        // Calculate frequency of the number
        int frequency = findFrequency(arr, num);
        System.out.println("Frequency of " + num + " in the array is: " + frequency);

        scanner.close();
    }

    // Method to find frequency of a number in an array
    public static int findFrequency(int[] arr, int num) {
        int frequency = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                frequency++;
            }
        }
        return frequency;
    }
}
