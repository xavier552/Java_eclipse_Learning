package programs;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int num, rev, temp;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = reader.nextInt();        

        rev = 0; // Initialize reversed number

        // Reverse the number
        while (num > 0) {
            temp = num % 10; // Get the last digit
            rev = rev * 10 + temp; // Build the reversed number
            num = num / 10; // Remove the last digit
        }
        
        System.out.println("Reversed Number: " + rev); // Output the reversed number
        
        reader.close(); // Close the scanner
    }
}
