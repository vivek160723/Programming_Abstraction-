package task;

import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        double[] grades = new double[numberOfSubjects];
        int[] credits = new int[numberOfSubjects];

        // Input grades and credits
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();
        }

        // Calculate CGPA
        double totalGradePoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < numberOfSubjects; i++) {
            totalGradePoints += grades[i] * credits[i];
            totalCredits += credits[i];
        }

        double cgpa = totalGradePoints / totalCredits;
        double percentage = cgpa * 9.5; // Conversion factor (can vary based on institution)

        System.out.println("CGPA: " + String.format("%.2f", cgpa));
        System.out.println("Percentage: " + String.format("%.2f", percentage));

        scanner.close();
    }
}
