package Accessmodifier;

abstract class Car {
    abstract public void abstractMethod1();
    abstract public void abstractMethod2();
    
    public void normalMethod() {
        System.out.println("This is a method with body");
    }
}

class BMW extends Car {
    @Override
    public void abstractMethod1() {
        System.out.println("abstractMethod1: I am from BMW");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("abstractMethod2: I am from  2 BMW");
    }
}

class Volkswagen extends Car {
    @Override
    public void abstractMethod1() {
        System.out.println("abstractMethod1: I am from Volkswagen");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("abstractMethod2: I am from 2 Volkswagen");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        BMW obj1 = new BMW();
        obj1.abstractMethod1();
        obj1.abstractMethod2();
        obj1.normalMethod();
        
        Volkswagen obj2 = new Volkswagen();
        obj2.abstractMethod1();
        obj2.abstractMethod2();
    }
}
