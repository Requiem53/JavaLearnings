package Employees;

public abstract class Employee {
    private String name;
    private String employeeId;
    private double salary;

    public abstract void calculatePay();
    public abstract void displayInfo();

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary(){
        return  salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
