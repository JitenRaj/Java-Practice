/**
 * _01_Add_all_numbers_upto_n
 */
import java.util.Scanner;

public class _01_Add_all_numbers_upto_n {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = sum(n);
        System.out.println("Sum of all numbers upto " + n + " is " + result);
        input.close();
    }
      
    
    public static int sum(int num) {
        if (num > 0) {
          return num + sum(num - 1);
        } else {
          return 0;
        }
    }   
}