package com.Classtest;

class User {
    // Properties
    int id;
    String name;

    // Parameterized constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends User {
    // Additional properties
    double salary;

    // Parameterized constructor
    public Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Assuming salary is monthly
    }
}

public class Test {
    public static void main(String[] args) {
        // Creating an object of the Employee class
        Employee employee = new Employee(1, "Kartik", 5000.0);

        // Calculating and displaying annual salary
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Employee " + employee.name + "'s annual salary: " + annualSalary);
    }
}