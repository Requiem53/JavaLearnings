package ConstructorsQuiz;

public class Person {
    String firstName;
    String lastName;
    String gender;
    int age;
    String address;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String gender, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }
}
