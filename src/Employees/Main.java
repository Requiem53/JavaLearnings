package Employees;

import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hey there, start typing your Java code here...
        Employee employee;

        System.out.print("Enter employee type (1 - Hourly, 2 - Salaried, 3 - Commissioned): ");
        int type = sc.nextInt();

        System.out.print("Enter the employee's name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter the employee's ID: ");
        String id = sc.nextLine();

        if(type == 1){
            System.out.print("Enter the hourly rate: ");
            int rate = sc.nextInt();

            System.out.print("Enter the hours worked: ");
            int hours = sc.nextInt();

            employee = new HourlyEmployee(name, id, rate, hours);
        }else if(type == 2){
            System.out.print("Enter the annual salary: ");
            double salary = sc.nextDouble();

            employee = new SalariedEmployee(name, id, salary);
        }else {
            System.out.print("Enter the commission rate: ");
            double comRate = sc.nextDouble();
            System.out.print("Enter the sales: ");
            int sales = sc.nextInt();

            employee = new CommissionedEmployee(name, id, comRate, sales);
        }

        Tester.test(employee);
    }
}
