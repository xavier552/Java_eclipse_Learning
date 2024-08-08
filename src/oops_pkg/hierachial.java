package oops_pkg;

import java.util.Scanner;

class Member {
    // Constructor for Member class
    public void memberDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter phone number:");
        long phoneNumber = sc.nextLong(); // Changed to long for phone number
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter address:");
        String address = sc.nextLine();
        
        // Print member details
        System.out.println("Member Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println();
    }
}

class Employee extends Member {
    public void employeeDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee specialization:");
        String specialization = sc.nextLine();
        System.out.println("Department:");
        String department = sc.nextLine();
        
        // Print employee details
        System.out.println("Employee Details: ");
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

class Manager extends Member {
    public void managerDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter manager specialization:");
        String specialization = sc.nextLine();
        System.out.println("Department:");
        String department = sc.nextLine();
        
        // Print manager details
        System.out.println("Manager Details: ");
        System.out.println("Specialization: " + specialization);
        System.out.println("Department: " + department);
        System.out.println();
    }
}

public class hierachial {
    public static void main(String[] args) {
        Manager managerObj = new Manager();
        managerObj.memberDetails();
        managerObj.managerDetails();

        Employee employeeObj = new Employee();
        employeeObj.memberDetails();
        employeeObj.employeeDetails();
    }
}
