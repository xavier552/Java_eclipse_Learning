package programs;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        
        double sum = n1 + n2 + n3;
        double avg = sum / 3;
        
        System.out.println("Average = " + avg);
        
        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
