public class Manager extends Employee {
    private String department;
    public Manager(String firstName, String lastName, int employeeID, String department) {
        super(firstName, lastName, employeeID);
        this.department = department;
    }
    // Getter
    public String getDepartment() {
        return department;
    }
    // Setter
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String employeeSummary() {
        return super.employeeSummary() + "\nDepartment: " + getDepartment();
    }
}
