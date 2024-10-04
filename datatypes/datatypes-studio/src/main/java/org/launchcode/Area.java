package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter a radius: ");

        // Read the input and store it in a variable
        double radius = scanner.nextDouble();

        // Define the constant for pi
        final double PI = 3.14;

        // Calculate the area of the circle
        double area = Circle.getArea(radius);

        // Print the result
        System.out.println("The area of a circle of radius: "+ radius + " area: " + area);

        // Close the scanner
        scanner.close();
    }
}
