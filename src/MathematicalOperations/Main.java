package MathematicalOperations;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        Scanner sc = new Scanner(System.in);

        Operation someOperation = null;
        double left,right;
        System.out.print("Enter the first number: ");
        left = sc.nextDouble();
        System.out.print("Enter the second number: ");
        right = sc.nextDouble();

        System.out.print("Choose an operator (+ - * /): ");
        char op = sc.next().charAt(0);


        switch(op){
            case '+':
                someOperation = new Addition(left, right);
                break;

            case '-':
                someOperation = new Subtraction(left, right);
                break;

            case '*':
                someOperation = new Multiplication(left, right);
                break;

            case '/':
                someOperation = new Division(left, right);
                break;
        }



        Tester.test(someOperation);
    }
}
