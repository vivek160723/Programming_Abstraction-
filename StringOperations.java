package task;
public class StringOperations {

    public static void main(String[] args) {
        // Example strings A and B
        String A = "hello";
        String B = "world";
        
        // Sum of lengths
        int sumOfLengths = calculateLength(A) + calculateLength(B);
        System.out.println("Sum of lengths: " + sumOfLengths);
        
        // Lexicographical comparison
        boolean isALarger = compareStrings(A, B) > 0;
        System.out.println("Is A lexicographically larger than B: " + isALarger);
        
        // Capitalize and concatenate
        String capitalizedA = capitalizeFirstLetter(A);
        String capitalizedB = capitalizeFirstLetter(B);
        System.out.println("Capitalized strings: " + capitalizedA + " " + capitalizedB);
    }

    // Method to calculate the length of a string
    private static int calculateLength(String str) {
        int length = 0;
        while (true) {
            try {
                @SuppressWarnings("unused")
				char c = str.charAt(length);
                length++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return length;
    }

    // Method to lexicographically compare two strings
    private static int compareStrings(String A, String B) {
        int lengthA = calculateLength(A);
        int lengthB = calculateLength(B);
        int minLength = (lengthA < lengthB) ? lengthA : lengthB;
        
        for (int i = 0; i < minLength; i++) {
            char charA = A.charAt(i);
            char charB = B.charAt(i);
            if (charA != charB) {
                return charA - charB;
            }
        }
        return lengthA - lengthB;
    }

    // Method to capitalize the first letter of a string
    private static String capitalizeFirstLetter(String str) {
        if (str == null || calculateLength(str) == 0) {
            return str;
        }
        char firstChar = str.charAt(0);
        char[] chars = new char[calculateLength(str)];
        chars[0] = (char) ((firstChar >= 'a' && firstChar <= 'z') ? firstChar - ('a' - 'A') : firstChar);
        
        for (int i = 1; i < chars.length; i++) {
            chars[i] = str.charAt(i);
        }
        
        return new String(chars);
    }
}

