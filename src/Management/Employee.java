package Management;

public class Employee extends Person{

    double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public void performTask(){
        System.out.println(getName() + " is working");
    }

    public String toString(){
        return super.toString() + " - " + salary;
    }
}
