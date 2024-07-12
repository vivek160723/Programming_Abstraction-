package task;
import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input basic salary and allowances
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        
        System.out.print("Enter House Rent Allowance (HRA): ");
        double hra = scanner.nextDouble();

 
        // Calculate gross salary
        double grossSalary = basicSalary + hra;
        
        System.out.println("Gross Salary: " + grossSalary);

        
        System.out.print("Enter Income Tax Deduction: ");
        double incomeTax = scanner.nextDouble();

        // Calculate total deductions
        double totalDeductions = incomeTax;

        // Calculate net salary
        double netSalary = grossSalary - totalDeductions;

        System.out.println("Net Salary: " + netSalary);

        scanner.close();
    }
}
