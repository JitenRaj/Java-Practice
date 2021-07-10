/**
 * _01_Function_example
 */
import java.util.Scanner;

public class _01_Function_example {

    public static void Hello() {
        System.out.println("Enter your name : ");
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println("Hello " + name + " Welcome to Java Programming World");

        input.close();
    }
    public static void main(String[] args) {
        Hello();
    }
}