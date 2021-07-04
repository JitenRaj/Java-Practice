import java.util.Scanner;

public class _03_for_loop {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number: ");
        Scanner num_scan = new Scanner(System.in);
        num = num_scan.nextInt();

        System.out.println("for loop: ");

        for( int i = 0 ; i < num ; i++) {
            System.out.println(i);
        }

        num_scan.close();
    }
}