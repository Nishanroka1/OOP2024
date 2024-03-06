package week2;

import java.util.Scanner;

public class FractionDecimal {
    public static void main(String[] args) {
        // Read the numerator and denominator from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();
        scanner.close();

        // Calculate the decimal equivalent of the fraction
        double decimalEquivalent = (double) numerator / denominator;

        // Print the decimal equivalent
        System.out.println("Decimal equivalent of the fraction: " + decimalEquivalent);
    }
}
