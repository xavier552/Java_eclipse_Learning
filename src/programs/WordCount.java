package programs;

import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Split the string into words using space as a delimiter
        String[] words = s.split("\\s+"); // Use regex to handle multiple spaces
        int count = words.length; // Count the number of words

        System.out.println("Number of words: " + count);
        sc.close(); // Close the scanner
    }
}
