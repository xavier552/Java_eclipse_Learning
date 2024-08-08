package programs;

import java.util.Scanner;

public class RepeatingCharactersString {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputWord = reader.next();

        System.out.println("Repeating Characters:");

        // Loop through the string
        for (int i = 0; i < inputWord.length(); i++) {
            char current = inputWord.charAt(i);
            // Check if current character is already printed
            if (inputWord.indexOf(current) != i) {
                // If found again, print it and skip further checks
                System.out.println(current);
                // Move to next character after the current one
                while (i < inputWord.length() && inputWord.charAt(i) == current) {
                    i++;
                }
            }
        }

        reader.close();
    }
}

