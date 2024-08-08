package programs;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        // Example with a fixed number
        int a = 145;
        int b = a % 10;       // Last digit
        int c = (a % 100) / 10; // Middle digit
        int d = (a % 1000) / 100; // First digit
        System.out.println("Sum of digits of 145: " + (b + c + d));

        // Sum of digits using user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int r, s = 0;
        
        while (num > 0) {
            r = num % 10; // Get the last digit
            s = s + r;    // Add it to the sum
            num = num / 10; // Remove the last digit
        }
        
        System.out.println("Sum of digits: " + s);
        sc.close(); // Close the scanner
    }
}
