package oops_pkg;

import java.util.Scanner;

interface Bank {
    void accountDetails();
    double mainBalance();
    void withdrawal(double withdrawalAmount);
    void deposit(double depositAmount);
}

class ICICI implements Bank {
    String accountHolder;
    long accountNumber;
    double mainBalance;

    ICICI(String accountHolder, long accountNumber, double mainBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.mainBalance = mainBalance;
    }

    @Override
    public void accountDetails() {
        System.out.println("Account details are:");
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Main Balance: " + mainBalance);
    }

    @Override
    public double mainBalance() {
        return mainBalance;
    }

    @Override
    public void withdrawal(double amount) {
        if (amount > mainBalance) {
            System.out.println("Insufficient balance!!!");
        } else {
            mainBalance -= amount;
            System.out.println("Withdrawal successful! New Balance: " + mainBalance);
        }
    }

    @Override
    public void deposit(double deposit) {
        if (deposit <= 0) {
            System.out.println("Deposit amount must be positive!");
        } else {
            mainBalance += deposit;
            System.out.println("Deposit successful! New Balance: " + mainBalance);
        }
    }
}

public class InterfaceBankImplementation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter your Account Details \nAccount Holder Name:");
        String accountHolder = reader.nextLine();
        
        System.out.println("Account Number:");
        long accountNumber = reader.nextLong();
        
        System.out.println("Initial Balance:");
        double mainBalance = reader.nextDouble();
        
        char choice = 'N';
        ICICI obj = new ICICI(accountHolder, accountNumber, mainBalance);
        
        do {
            System.out.println("Select an option:");
            System.out.println("1. Display Account Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            int optionSelected = reader.nextInt();
            
            switch (optionSelected) {
                case 1: 
                    obj.accountDetails(); 
                    break;
                case 2: 
                    System.out.println("Balance: " + obj.mainBalance()); 
                    break;
                case 3: 
                    System.out.println("Enter the deposit amount:");
                    double deposit = reader.nextDouble();
                    obj.deposit(deposit); 
                    break;
                case 4: 
                    System.out.println("Enter the withdrawal amount:");
                    double withdrawal = reader.nextDouble();
                    obj.withdrawal(withdrawal); 
                    break;
                default: 
                    System.out.println("Invalid option");
            }
            
            System.out.println("Do you want to continue? (Y/y)");
            choice = reader.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        
        reader.close();
    }
}
