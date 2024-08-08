package programs;

public class StartPrint {

    public static void main(String[] args) {
        // Print a right-angled triangle pattern
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
