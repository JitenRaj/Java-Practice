// Program to take a string as user input and print it
import java.util.Scanner ;

public class string_input {
    public static void main(String[] args) {
        System.out.println("Enter an input: ");

        Scanner input = new Scanner(System.in);
        // First we have to declare a new scanner
        String string_input = input.nextLine();
        // nextLine is used to take a string as input in next Line

        System.out.println(string_input);
    }
}