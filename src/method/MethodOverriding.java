package method;

// Base class
class Shape {
    public void draw() {
        System.out.println("Draw a circle");
    }
}

// Subclass that overrides the draw method
class Square extends Shape {
    @Override
    public void draw() {
        super.draw(); // Call the draw method of the superclass
        System.out.println("Draw a square");
    }
}

// Main class to demonstrate method overriding
public class MethodOverriding {
    public static void main(String[] args) {
        Square ob = new Square(); // Create an instance of Square
        ob.draw(); // Call the draw method
    }
}
