package week2;

import java.util.Scanner;

public class SquareCalculations {
    public static void main(String[] args) {
        // Read the length of the square's side from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the square's side: ");
        int sideLength = scanner.nextInt();
        scanner.close();

        // Calculate the perimeter and area of the square
        int perimeter = 4 * sideLength;
        int area = sideLength * sideLength;

        // Print the results
        System.out.println("Square's Perimeter: " + perimeter);
        System.out.println("Square's Area: " + area);
    }
}

