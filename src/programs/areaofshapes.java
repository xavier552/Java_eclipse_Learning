package programs;

public class areaofshapes {

    public static void main(String[] args) {
        areaofshapes ob = new areaofshapes(); // Create an instance of the Area class

        // Calculate and print area of rectangle
        ob.rect();

        // Calculate and print area of circle
        double circleArea = ob.cir();
        System.out.println("Circle Area = " + circleArea);

        // Calculate and print area of square
        ob.sqr(4);

        // Calculate and print area of triangle
        double triangleArea = ob.tri(10, 5);
        System.out.println("Triangle Area = " + triangleArea);
    }

    // Method to calculate area of rectangle
    public void rect() {
        int length = 20;
        int width = 30;
        int area = length * width;
        System.out.println("Rectangle Area = " + area);
    }

    // Method to calculate area of circle
    public double cir() {
        int radius = 10;
        double area = 3.14 * radius * radius; // Area = πr²
        return area;
    }

    // Method to calculate area of square
    public void sqr(int side) {
        int area = side * side; // Area = side²
        System.out.println("Square Area = " + area);
    }

    // Method to calculate area of triangle
    public double tri(int base, int height) {
        double area = 0.5 * base * height; // Area = ½ * base * height
        return area;
    }
}
