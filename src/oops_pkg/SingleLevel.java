package oops_pkg;

// Parent class
class Parent {
    public void parentMethod() {
        System.out.println("parent");
    }
}

// Child class extending Parent
class Child extends Parent {
    public void childMethod() {
        System.out.println("child");
    }
}

// Main class to demonstrate inheritance
public class SingleLevel {
    public static void main(String[] args) {
        // Create an instance of Child
        Child ob = new Child();
        
        // Call methods from Child and Parent classes
        ob.childMethod();    // Output: child
        ob.parentMethod();   // Output: parent
    }
}
