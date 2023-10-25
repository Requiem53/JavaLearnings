package Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> persons = new ArrayList<Person>();
        String input, name, name2;
        int age;
        double salary;

        Person person;
        boolean found = false;
        double raise;
        int count;

        while (true){
            System.out.print("Enter person type: ");
            input = sc.nextLine();
            if (input.equals("DONE")) {
                break;
            }
            switch (input.charAt(0)) {
                case 'c':
                    System.out.print("Enter customer name: ");
                    name = sc.nextLine();
                    System.out.print("Enter customer age: ");
                    age = sc.nextInt();
                    // TODO add new Customer in persons here
                    person = new Customer(name, age);
                    persons.add(person);
                    break;
                case 'e':
                    System.out.print("Enter employee name: ");
                    name = sc.nextLine();
                    System.out.print("Enter employee age: ");
                    age = sc.nextInt();
                    System.out.print("Enter employee salary: ");
                    salary = sc.nextDouble();
                    // TODO add new Employee in persons here
                    person = new Employee(name, age, salary);
                    persons.add(person);
                    break;
                // TODO add more cases for other Person subclasses here
                case 'm':
                    System.out.print("Enter manager name: ");
                    name = sc.nextLine();
                    System.out.print("Enter manager age: ");
                    age = sc.nextInt();
                    System.out.print("Enter manager salary: ");
                    salary = sc.nextDouble();
                    // TODO add new Employee in persons here
                    person = new Manager(name, age, salary);
                    persons.add(person);
                    break;
                case 'd':
                    System.out.print("Enter developer name: ");
                    name = sc.nextLine();
                    System.out.print("Enter developer age: ");
                    age = sc.nextInt();
                    System.out.print("Enter developer salary: ");
                    salary = sc.nextDouble();
                    // TODO add new Employee in persons here
                    person = new Developer(name, age, salary);
                    persons.add(person);
                    break;
            }
            sc.nextLine();
        }
        while (true) {
            System.out.print("Enter action: ");
            input = sc.nextLine();
            switch (input) {
                case "DONE":
                    return;
                case "Birthday":
                    found = false;
                    System.out.print("Whose birthday? ");
                    name = sc.nextLine();
                    // TODO find name and call birthday
                    for(Person p : persons){
                        if(p.getName().compareTo(name) == 0){
                            p.birthday();
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Invalid input");
                    }
                    break;
                case "Assign PM":
                    found = false;
                    System.out.print("Select developer: ");
                    name = sc.nextLine();
                    System.out.print("Select manager: ");
                    name2 = sc.nextLine();
                    // TODO find developer "name" and manager "name2" and assign PM
                    for(Person p : persons){
                        if(found){
                            break;
                        }

                        if(p.getName().compareTo(name) == 0 && p instanceof Developer){
                            for(Person m : persons){
                                if(m.getName().compareTo(name2) == 0 && m instanceof Manager){
                                    ((Developer) p).setProjectManager((Manager) m);
                                    found = true;
                                    break;
                                }else if(name2.compareTo("NULL") == 0 && m instanceof Manager){
                                    ((Developer) p).removePM();
                                    found = true;
                                    break;
                                }
                            }
                        }
                    }
                    if(!found){
                        System.out.println("Invalid input");
                    }
                    break;
                // TODO add more action cases here
                case "Perform Task":
                    for(Person p : persons){
                        p.performTask();
                    }
                    break;
                case "Give Raise":
                    found = false;
                    System.out.print("Enter manager: ");
                    name = sc.nextLine();
                    System.out.print("Enter employee: ");
                    name2 = sc.nextLine();
                    System.out.print("Enter increase: ");
                    raise = sc.nextDouble();
                    sc.nextLine();
                    for(Person m : persons){
                        if(found){
                            break;
                        }

                        if(m.getName().compareTo(name) == 0 && m instanceof Manager){
                            for(Person e : persons){
                                if(e.getName().compareTo(name2) == 0 && e instanceof Employee){
                                    ((Manager) m).giveRaise((Employee) e, raise);
                                    found = true;
                                    break;
                                }
                            }
                        }
                    }
                    if(!found){
                        System.out.println("Invalid input");
                    }
                    break;
                case "Customer Speak":
                    found = false;
                    System.out.print("Select customer: ");
                    name = sc.nextLine();
                    System.out.print("Select employee: ");
                    name2 = sc.nextLine();

                    for(Person c : persons){
                        if(found){
                            break;
                        }
                        if(c.getName().compareTo(name) == 0 && c instanceof Customer){
                            for(Person e : persons){
                                if(e.getName().compareTo(name2) == 0 && e instanceof Employee){
                                    ((Customer) c).speak((Employee)e);
                                    found = true;
                                    break;
                                }
                            }
                        }
                    }
                    if(!found){
                        System.out.println("Invalid input");
                    }
                    break;
                case "Person List":
                    count = 0;
                    for(Person p : persons){
                        System.out.println(p);
                        count++;
                    }
                    if(count > 0){
                        System.out.println("Total Count: " + count);
                    }else{
                        System.out.println("No persons in list");
                    }
                    break;
                case "Developer List":
                    count = 0;
                    for(Person p : persons){
                        if(p instanceof Developer){
                            System.out.println(p);
                            count++;
                        }
                    }
                    if(count > 0){
                        System.out.println("Total Count: " + count);
                    }else{
                        System.out.println("No developers in list");
                    }
                    break;
                case "Manager List":
                    count = 0;
                    for(Person p : persons){
                        if(p instanceof Manager){
                            System.out.println(p);
                            count++;
                        }
                    }
                    if(count > 0){
                        System.out.println("Total Count: " + count);
                    }else{
                        System.out.println("No managers in list");
                    }
                    break;
                case "Employee List":
                    count = 0;
                    for(Person p : persons){
                        if(p instanceof Employee){
                            System.out.println(p);
                            count++;
                        }
                    }
                    if(count > 0){
                        System.out.println("Total Count: " + count);
                    }else{
                        System.out.println("No employees in list");
                    }
                    break;
                case "Customer List":
                    count = 0;
                    for(Person p : persons){
                        if(p instanceof Customer){
                            System.out.println(p);
                            count++;
                        }
                    }
                    if(count > 0){
                        System.out.println("Total Count: " + count);
                    }else{
                        System.out.println("No customers in list");
                    }
                    break;
                default:
                    System.out.println("Invalid action");
            }
        }
    }
}
