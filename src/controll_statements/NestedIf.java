package controll_statements;

public class NestedIf {

    public static void main(String[] args) {
        int age = 40;
        int weight = 60;

        if (age > 18) {
            if (weight > 55) {
                System.out.println("You can donate blood.");
            } else {
                System.out.println("Cannot donate blood; weight is less than 55 kg.");
            }
        } else {
            System.out.println("Cannot donate blood; age is less than 18.");
        }
    }
}
