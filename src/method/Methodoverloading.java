package method;

public class Methodoverloading {

    public static void main(String[] args) {
        Methodoverloading ob = new Methodoverloading();
        
        // Calling the add method with no parameters
        ob.add();
        
        // Calling the add method with two int parameters
        ob.add(10, 20);
        
        // Calling the add method with an int and a double
        ob.add(6.9, 20);
        
        // Calling the add method with a double and an int
        ob.add(20, 12.90);
    }

    // Method with no parameters
    public void add() {
        int a = 1, b = 2;
        int c = a + b;
        System.out.println("c = " + c);
    }

    // Method with two int parameters
    public void add(int a, int b) {
        int c = a + b;
        System.out.println("c = " + c);
    }

    // Method with an int and a double parameter
    public void add(int a, double b) {
        double c = a + b;
        System.out.println("c = " + c);
    }

    // Method with a double and an int parameter
    public void add(double a, int b) {
        double c = a + b;
        System.out.println("c = " + c);
    }
}
