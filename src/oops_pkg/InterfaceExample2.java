package oops_pkg;

// Interface defining basic animal behaviors
interface IBasicAnimal {
    void eat();
    void sleep();
}

// Monkey class with its own methods
class Monkey {
    public void jump() {
        System.out.println("Jump method from Monkey");
    }
    
    public void bite() {
        System.out.println("Bite method from Monkey");
    }
}

// Human class extending Monkey and implementing IBasicAnimal
class Human extends Monkey implements IBasicAnimal {
    public void speak() {
        System.out.println("Speak method from Human class");
    }

    @Override
    public void eat() {
        System.out.println("Eat method implemented for Human");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep method implemented for Human");
    }
}

// Main class to demonstrate the functionality
public class InterfaceExample2 {
    public static void main(String[] args) {
        Human humanObj = new Human();
        
        // Calling methods from the Human class
        humanObj.speak();
        humanObj.eat();
        humanObj.sleep();
        
        // Calling methods inherited from the Monkey class
        humanObj.jump();
        humanObj.bite();
    }
}
