public class TestClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Emily", "Liu", 10642832);
        employee.setSalary(500.0);
        System.out.println(employee.employeeSummary());
        System.out.println();
        Manager manager = new Manager("Nina", "Hoper", 19045671, "A");
        manager.setSalary(950.0);
        System.out.println(manager.employeeSummary());
    }
}