package Employees;

public class HourlyEmployee extends Employee{

    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, String employeeID, double hourlyRate, double hoursWorked){
        super(name, employeeID);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void calculatePay(){
        setSalary(hourlyRate * hoursWorked);
    }

    @Override
    public void displayInfo() {
        System.out.printf("Hourly Employee " + getName() + " with ID " + getEmployeeId()
                + " earned $%.2f this pay period. \n", getSalary());
    }
}
