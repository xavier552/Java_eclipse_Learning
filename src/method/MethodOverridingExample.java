package method;

// Base class
class Animals {
    public void Print() {
        System.out.println("This is Animal Class");
    }
}

// Subclass that overrides the Print method
class Bird extends Animals {
    @Override
    public void Print() {
        System.out.println("This is Bird Class");
        //super.Print(); // Uncomment this line to call the parent method
    }
}

// Main class to demonstrate method overriding
public class MethodOverridingExample {
    public static void main(String[] args) {
        Bird B = new Bird(); // Create an instance of Bird
        B.Print(); // Call the Print method from Bird

        Animals A = new Animals(); // Create an instance of Animals
        A.Print(); // Call the Print method from Animals
    }
}
