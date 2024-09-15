public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private double salary;
    public Employee(String firstName, String lastName, int employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        salary = 0;
    }
    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public double getSalary() {
        return salary;
    }
    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Employee information
    public String employeeSummary() {
        return "First name: " + getFirstName() +
                "\nLast name: " + getLastName() +
                "\nID: " + getEmployeeID() +
                "\nSalary: " + getSalary();
    }
}
