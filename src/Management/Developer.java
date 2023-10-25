package Management;

public class Developer extends Employee{
    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    private Manager projectManager;

    public Manager getProjectManager() {
        return projectManager;
    }

    protected void setProjectManager(Manager projectManager) {
        if(this.projectManager == null){
            this.projectManager = projectManager;
        }else{
            System.out.println(getName() + " already has a manager");
        }
    }

    public void removePM(){
        projectManager = null;
    }

    public void birthday(){
        super.birthday();
        if(projectManager != null){
            projectManager.giveRaise(this, getSalary() * 0.05);
        }
    }

    public void performTask(){
        System.out.println(getName() + " is coding");
    }

    public String toString(){
        if(projectManager != null){
            return super.toString() + " [" + projectManager.getName() + "]";
        }else{
            return super.toString();
        }
    }
}
