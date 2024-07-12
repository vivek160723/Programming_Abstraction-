package task;
public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 400; // Example value for a
        int b = 20; // Example value for b

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swap a and b without using a third variable
        a = a + b; // a now becomes 30
        b = a - b; // b becomes 10
        a = a - b; // a becomes 20

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
