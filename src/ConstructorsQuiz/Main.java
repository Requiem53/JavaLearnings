package ConstructorsQuiz;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName;
        String lastName;
        String gender;
        int age;
        String address;

        System.out.print("Enter first name: ");
        firstName = sc.nextLine();
        System.out.print("Enter last name: ");
        lastName = sc.nextLine();
        System.out.print("Enter gender: ");
        gender = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter address: ");
        sc.nextLine();
        address = sc.nextLine();

        Person person1 = new Person(firstName, lastName);
        Person person2 = new Person(firstName, lastName, gender, age, address);

        System.out.println(" ");

        System.out.println("Object 1");
        System.out.println("First name: " + person1.firstName);
        System.out.println("Last name: " + person1.lastName);
        System.out.println("Gender: " );
        System.out.println("Age: " );
        System.out.println("Address: " );

        System.out.println(" ");

        System.out.println("Object 2");
        System.out.println("First name: " + person2.firstName);
        System.out.println("Last name: " + person2.lastName);
        System.out.println("Gender: " + person2.gender);
        System.out.println("Age: " + person2.age);
        System.out.println("Address: " + person2.address);
    }
}