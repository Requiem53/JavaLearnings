package Management;

public class Manager extends Employee{
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    public void giveRaise(Employee e, double increase){
        if(increase < 0){
            System.out.println("Invalid increase");
            return;
        }
        e.setSalary(e.getSalary() + increase);
        if(e != this){
            setSalary(getSalary() + (increase / 2.0));
        }
    }

    public String toString(){
        return "Mgr. " + super.toString();
    }
}
