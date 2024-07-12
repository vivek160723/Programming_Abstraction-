package task;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Remove vowels from the string
        String result = removeVowels(input);
        
        // Display the result
        scanner.close();
        System.out.println("String without vowels: " + result);
    }

    public static String removeVowels(String input) {
        // Convert the input string to a character array
        char[] inputArray = input.toCharArray();
        
        // Create a new character array to store the result
        char[] resultArray = new char[inputArray.length];
        int index = 0;
        
        // Iterate through the input character array
        for (char c : inputArray) {
            // If the character is not a vowel, add it to the result array
            if (!isVowel(c)) {
                resultArray[index++] = c;
            }
        }
        
        // Create a new string from the result array up to the index
        return new String(resultArray, 0, index);
    }

    // Helper method to check if a character is a vowel
    public static boolean isVowel(char c) {
        // Convert character to lowercase
        c = Character.toLowerCase(c);
        
        // Check if the character is a vowel
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}