package programs;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to display
        int fnumber = 0, snumber = 1, tnumber;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) { // Loop until n
            System.out.print(fnumber + (i < n - 1 ? ", " : ""));
            tnumber = fnumber + snumber;
            fnumber = snumber;
            snumber = tnumber;
        }
    }
}
