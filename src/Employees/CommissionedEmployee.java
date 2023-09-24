package Employees;

public class CommissionedEmployee extends Employee {
    private double commissionRate;
    private double sales;

    public CommissionedEmployee(String name, String employeeId, double commissionRate, double sales){
        super(name, employeeId);
        this.commissionRate = commissionRate;
        this.sales = sales;
    }

    public void calculatePay(){
        setSalary(commissionRate * sales);
    }

    public void displayInfo(){
        System.out.printf("Commissioned Employee " + getName() + " with ID " + getEmployeeId()
                + " earned $%.2f this pay period. \n", getSalary());
    }
}
