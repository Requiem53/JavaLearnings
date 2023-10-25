package Management;

public class Customer extends Person{
    public Customer(String name, int age) {
        super(name, age);
    }

    public void performTask(){
        System.out.println(getName() + " is browsing through");
    }

    public void speak(Employee e){
        if(e instanceof Developer && getAge() > e.getAge() && ((Developer) e).getProjectManager() != null){
            System.out.println("Can I see your manager " + ((Developer) e).getProjectManager().getName() + "?");
            return;
        }
        System.out.println("Oh, hello, " + e.getName() + ". Can you assist me?");
    }
}
