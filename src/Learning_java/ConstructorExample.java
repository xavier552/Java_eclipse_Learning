package Learning_java;

// CONSTRUCTOR EXAMPLE
public class ConstructorExample {
    
    int Id;
    String EName;
    int Age;

    // Constructor to initialize fields
    public ConstructorExample(int Id, String EName, int Age) {
        this.Id = Id;
        this.EName = EName;
        this.Age = Age;
    }

    public static void main(String[] args) {
        // Create an instance of ConstructorExample
        ConstructorExample obj = new ConstructorExample(12, "xavier", 24);
        
        // Print the details of the employee
        System.out.println("Details: " + obj.Id + " " + obj.EName + " " + obj.Age);
    }
}
