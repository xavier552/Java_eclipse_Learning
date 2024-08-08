package programs;

import java.util.Scanner;

public class ScannerCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        
        System.out.println("Enter an operator (+, -, *, /):");
        char choice = sc.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println("Sum: " + (a + b));
                break;
            case '-':
                System.out.println("Difference: " + (a - b));
                break;
            case '*':
                System.out.println("Product: " + (a * b));
                break;
            case '/':
                // Check for division by zero
                if (b != 0) {
                    System.out.println("Quotient: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break; 
        }
        
        sc.close(); // Close the scanner
    }
}
