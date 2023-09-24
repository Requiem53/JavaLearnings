package Employees;

public class SalariedEmployee extends Employee{
    private double annualSalary;

    public SalariedEmployee(String name, String employeeID, double annualSalary){
        super(name, employeeID);
        this.annualSalary = annualSalary;
    }

    public void calculatePay(){
        setSalary(annualSalary/26);
    }

    @Override
    public void displayInfo() {
        System.out.printf("Salaried Employee " + getName() + " with ID " + getEmployeeId()
        + " earned $%.2f this pay period. \n", getSalary());
    }
}
