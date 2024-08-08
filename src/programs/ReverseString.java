package programs;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter the String:");
        String word = reader.next(); // Read the string input
        
        // Create a character array to hold the reversed characters
        char[] charArray = new char[word.length()];

        // Loop to reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            charArray[i] = word.charAt(i); // Assign each character in reverse order
            System.out.print(charArray[i]); // Print the character
        }
        
        System.out.println(); // For a new line after printing the reversed string
        
        reader.close(); // Close the scanner
    }
}
