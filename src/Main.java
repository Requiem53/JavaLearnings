import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i<size; i++){
            System.out.println("Enter an element of the array: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The elements of the array: ");

        for(int i: numbers){
            System.out.println(i);
        }

    }
}