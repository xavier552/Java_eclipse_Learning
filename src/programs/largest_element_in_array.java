package programs;

import java.util.Scanner;

public class largest_element_in_array 
{

    public static void main(String[] args) {
        int[] ar = new int[7];
        int max; // Variable to hold the maximum value
        System.out.println("Enter the numbers:");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) 
        {
            ar[i] = sc.nextInt();
        }

        // Initialize max with the first element of the array
        max = ar[0];

        // Loop through the array to find the largest element
        for (int i = 1; i < ar.length; i++)
        { // Start from the second element
            if (ar[i] > max)
            {
                max = ar[i]; // Update max if current element is larger
            }
        }

        // Print the largest element
        System.out.println("Largest number in the array is: " + max);
        sc.close(); // Close the scanner to avoid resource leak
    }
}
