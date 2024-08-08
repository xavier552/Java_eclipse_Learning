package oops_pkg;

// Interface defining methods for shape properties
interface ShapesProperties {
    void sides();
    void dimensions();
    void area();
}

// Interface for displaying color
interface Display {
    void colour();
}

// Triangle class implementing ShapesProperties interface
class Triangle implements ShapesProperties {
    @Override
    public void sides() {
        System.out.println("3 sides");
    }

    @Override
    public void dimensions() {
        System.out.println("Length, Breadth, Height");
    }

    @Override
    public void area() {
        System.out.println("Area = 1/2 * Base * Height");
    }
}

// Circle class implementing both ShapesProperties and Display interfaces
class Circle implements ShapesProperties, Display {
    @Override
    public void sides() {
        System.out.println("No sides");
    }

    @Override
    public void dimensions() {
        System.out.println("Radius");
    }

    @Override
    public void area() {
        System.out.println("Area = 3.14 * Radius * Radius");
    }

    @Override
    public void colour() {
        System.out.println("Colour of figures");
    }
}

// Main class to demonstrate interface usage
public class InterfaceExample {
    public static void main(String[] args) {
        Triangle triangleObj = new Triangle();
        Circle circleObj = new Circle();
        
        // Triangle properties
        System.out.println("Triangle:");
        triangleObj.area();
        triangleObj.dimensions();
        triangleObj.sides();
        
        // Circle properties
        System.out.println("\nCircle:");
        circleObj.area();
        circleObj.dimensions();
        circleObj.sides();
        circleObj.colour();
    }
}
