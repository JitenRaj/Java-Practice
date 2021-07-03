// Program to take int as user input and print it
import java.util.Scanner ;

public class int_input {
    public static void main(String[] args) {
        System.out.println("Enter an input: ");

        Scanner input = new Scanner(System.in);
        // First we have to declare a new scanner
        int int_input = input.nextInt();
        // nextInt is used to take an Int as input

        System.out.println(int_input);
    }
}