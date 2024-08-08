package oops_pkg;

// Base class
class Father {
    public void fatherMethod() {
        System.out.println("father");
    }
}

// Intermediate class inheriting from Father
class Son extends Father {
    public void sonMethod() {
        System.out.println("son");
    }
}

// Grandchild class inheriting from Son
class Grandson extends Son {
    public void grandsonMethod() {
        System.out.println("grandson");
    }
}

// Main class to demonstrate multi-level inheritance
public class MultiLevel {
    public static void main(String[] args) {
        // Create an instance of Grandson
        Grandson ob = new Grandson();
        
        // Call methods from all levels of the inheritance hierarchy
        ob.fatherMethod();   // Output: father
        ob.sonMethod();      // Output: son
        ob.grandsonMethod(); // Output: grandson
    }
}
