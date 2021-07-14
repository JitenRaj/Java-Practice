import java.util.Scanner;

public class _06_fortune_teller {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");
        Scanner input = new Scanner(System.in);

        int inputNum = input.nextInt();
        

        if (inputNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("You will win a lottery");
        }
        input.close();
    }
}