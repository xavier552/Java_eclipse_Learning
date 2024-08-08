package programs;

import java.util.Scanner;

public class ArrayPosNegZero {
    public static void main(String[] args) {
        int[] ar = new int[8];
        System.out.println("Enter an array of 8 numbers:");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println("Entered numbers:");
        for (int num : ar) {
            System.out.println(num);
        }

        int positive = 0, negative = 0, zero = 0;

        for (int num : ar) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Count of positive numbers: " + positive);
        System.out.println("Count of negative numbers: " + negative);
        System.out.println("Count of zero numbers: " + zero);

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
