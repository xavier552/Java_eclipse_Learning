package programs;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter the year:");
        int year = read.nextInt();
        
        // Check if the year is a leap year
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If divisible by 100, check if divisible by 400
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        
        read.close();
    }
}
