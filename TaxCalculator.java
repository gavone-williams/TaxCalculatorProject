import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for gross weekly income
        System.out.print("Enter your gross weekly income: $");
        double income = scanner.nextDouble();

        double taxRate;

        // Determine tax rate based on income guidelines
        if (income < 500) {
            taxRate = 0.10;
        } else if (income >= 500 && income < 1500) {
            taxRate = 0.15;
        } else if (income >= 1500 && income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        // Perform final calculations
        double taxWithholding = income * taxRate;
        double netIncome = income - taxWithholding;

        // Print formatted summary output
        System.out.println("\n--- Weekly Tax Summary ---");
        System.out.printf("Gross Income:           $%.2f%n", income);
        System.out.printf("Applied Tax Rate:       %.0f%%%n", taxRate * 100);
        System.out.printf("Weekly Tax Withholding: $%.2f%n", taxWithholding);
        System.out.printf("Net Take-Home Pay:      $%.2f%n", netIncome);

        scanner.close();
    }
}