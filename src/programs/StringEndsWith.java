package programs;

import java.util.Scanner;

public class StringEndsWith {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        if (s.endsWith("language")) {
            System.out.println("String ends with 'language'");
        } else {
            System.out.println("String does not end with 'language'");
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
