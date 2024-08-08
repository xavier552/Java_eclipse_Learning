package programs;
import java.util.Scanner;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.nextInt();
        }
        
        System.out.println("Duplicate elements in the array:");
        boolean foundDuplicate = false; // To check if any duplicates were found
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    foundDuplicate = true; // Set flag to true if duplicate is found
                    break; // Stop inner loop to avoid printing the same duplicate multiple times
                }
            }
        }
        
        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }

        reader.close(); // Close the scanner
    }
}
