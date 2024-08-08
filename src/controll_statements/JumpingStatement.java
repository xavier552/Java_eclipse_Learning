package controll_statements;

public class JumpingStatement {

    public static void main(String[] args) {
        // Break and Continue
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                // Uncomment the line below to use break instead of continue
                break; // Exits the loop when i is 5
               // continue; // Skips the iteration when i is 5
            }
            System.out.println(i);
        }
    }
}
