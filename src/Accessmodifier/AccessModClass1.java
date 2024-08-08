package Accessmodifier;

class AccessModifierExample {
    private int privateVariable = 10;
    public int publicVariable = 12;
    int defaultVariable = 100; // Default access modifier
    protected int protectVariable = 15;
   
}
  
public class AccessModClass1  //extends AccessModifierExample
{
    public static void main(String[] args) {
        AccessModifierExample obj = new AccessModifierExample();
        // Accessing variables
        System.out.println("Default Variable: " + obj.defaultVariable);
        // System.out.println("Private Variable: " + obj.privateVariable); // This will cause an error
        // The private variable is not accessible here
        System.out.println("Protected Variable: " + obj.protectVariable);
        System.out.println("Public Variable: " + obj.publicVariable);
    }
}
