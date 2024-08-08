package programs;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Multiplication table of a number using for loop
        
        System.out.println("***** Multiplication Table of 5 ****");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * 6 = " + (i * 6));
        }
    }
}
