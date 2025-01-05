import java.util.Scanner;

public class WeeklyTaxCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weekly income
        System.out.print("Enter your weekly income: ");
        double income = scanner.nextDouble();

        // Declare variables
        double taxRate;
        double taxWithholding;

        // Determine tax rate based on income
        if (income < 500) {
            taxRate = 10.0;
        } else if (income >= 500 && income < 1500) {
            taxRate = 15.0;
        } else if (income >= 1500 && income < 2500) {
            taxRate = 20.0;
        } else {
            taxRate = 30.0;
        }

        // Calculate tax withholding
        taxWithholding = income * (taxRate / 100);

        // Display the result
        System.out.println("Your weekly tax withholding is: $" + taxWithholding);

        // Close the scanner
        scanner.close();
    }
}
