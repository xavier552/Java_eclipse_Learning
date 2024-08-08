package method;

public class differntmethods {

    public static void main(String[] args) {
        differntmethods ob = new differntmethods();

        // Calling the method to add
        ob.add();

        // Calling the method to subtract and storing the result
        int s = ob.sub();
        System.out.println("Sub = " + s);

        // Calling the method to multiply
        ob.mul(20, 30);

        // Calling the method to divide and storing the result
        double div = ob.div(20, 10);
        System.out.println("Div = " + div);
    }

    // Method without parameters and without return type
    public void add() {
        int a = 20, b = 30, c;
        c = a + b;
        System.out.println("Sum = " + c);
    }

    // Method with return type and without parameters
    public int sub() {
        int a = 20, b = 10, c;
        c = a - b;
        return c;
    }

    // Method without return type and with parameters
    public void mul(int a, int b) { 
        int c = a * b;
        System.out.println("Mul = " + c);
    }

    // Method with return type and with parameters
    public double div(int a, int b) {
        // Ensure no division by zero
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0; // Return a default value or handle as needed
        }
        double c = (double) a / b; // Casting to double for accurate division
        return c;
    }
}
