package programs;

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        // Find the longest word in a sentence
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String inputSentence = reader.nextLine();
        
        // Split the input sentence into words
        String[] words = inputSentence.split(" ");
        String longest = ""; // Initialize longest word
        
        // Iterate through the words to find the longest
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word; // Update longest if current word is longer
            }
        }
        
        System.out.println("Longest Word is: " + longest);
        reader.close(); // Close the scanner
    }
}
