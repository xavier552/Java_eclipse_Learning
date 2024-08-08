package programs;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        int num, cube, temp, arm = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = reader.nextInt();

        int copy = num; // Keep a copy of the original number

        // Calculate the sum of the cubes of each digit
        while (num > 0) {
            temp = num % 10; // Get the last digit
            cube = temp * temp * temp; // Cube the digit
            arm += cube; // Add to the Armstrong sum
            num /= 10; // Remove the last digit
        }

        // Output the result
        System.out.println("Sum of cubes: " + arm);
        if (copy == arm) {
            System.out.println(copy + " is an Armstrong number.");
        } else {
            System.out.println(copy + " is not an Armstrong number.");
        }

        reader.close(); // Close the scanner
    }
}
