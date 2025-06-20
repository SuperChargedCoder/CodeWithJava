package com.Java;

/*The static keyword in Java is used to indicate that a member (variable or method) belongs to the class rather than to any instance of the class
 * 
| Feature         | Static                     | Non-static                   |
| --------------- | -------------------------- | ---------------------------- |
| Accessed via    | Class name or object       | Only via object              |
| Memory          | Single copy (shared)       | Each object has its own copy |
| Common use case | Utility methods, constants | Instance-specific behavior   |
*/

public class StaticKeyword {
    private String accountHolder;
    private double balance;

    // Static variable - shared by all accounts
    private static String bankName = "Java Bank";

    public StaticKeyword(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Bank Name      : " + bankName); // accessed via static context
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
    }

    // Static method - can be called without object
    public static void displayBankName() {
        System.out.println("Welcome to " + bankName);
    }

    // Set a new bank name (if needed)
    public static void setBankName(String name) {
        bankName = name;
    }

    public static void main(String[] args) {
        // Calling static method directly using class name
        StaticKeyword.displayBankName();

        // Creating objects
        StaticKeyword acc1 = new StaticKeyword("Shubham", 50000);
        StaticKeyword acc2 = new StaticKeyword("Anjali", 75000);

        acc1.displayAccountInfo();
        System.out.println("----------------------");
        acc2.displayAccountInfo();

        // Changing the static variable using one object or class
        StaticKeyword.setBankName("Global Java Bank");

        System.out.println("\nAfter changing bank name:\n");
        acc1.displayAccountInfo();
        System.out.println("----------------------");
        acc2.displayAccountInfo();
    }
}

