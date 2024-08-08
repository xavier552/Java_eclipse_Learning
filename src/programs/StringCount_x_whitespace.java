package programs;

import java.util.Scanner;

public class StringCount_x_whitespace {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Entered string: " + s);
        int count = 0;

        // Count non-space characters
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Number of non-space characters: " + count);
        sc.close(); // Close the scanner to avoid resource leaks
    }
}

