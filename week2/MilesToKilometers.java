package week2;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        // Define the conversion factor
        final double MILES_TO_KILOMETERS = 1.60935;

        // Read miles from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of miles: ");
        double miles = scanner.nextDouble();
        scanner.close();

        // Convert miles to kilometers
        double kilometers = miles * MILES_TO_KILOMETERS;

        // Print the result
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
