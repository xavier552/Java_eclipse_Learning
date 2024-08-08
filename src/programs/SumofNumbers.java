package programs;

import java.util.Scanner;

public class SumofNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter the limit: ");
        int limit = reader.nextInt(); // Get the limit from the user
        
        int sum = 0; // Initialize sum to 0
        
        // Calculate the sum of numbers from 1 to limit
        for (int i = 1; i <= limit; i++) {
            sum += i; // Add current number to sum
        }
        
        // Output the result
        System.out.println("Sum of numbers from 1 to " + limit + " is: " + sum);
        
        reader.close(); // Close the scanner
    }
}
