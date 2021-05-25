/**
 * _01_while_loop
 */
import java.util.Scanner;
public class _01_while_loop {
  public static void main(String[] args) {
    System.out.println("Enter a number: ");
    Scanner num1 = new Scanner(System.in);
    System.out.println(num1.nextInt());
    num1.close();
    System.out.println("Enter a number: ");
    Scanner num2 = new Scanner(System.in);
    System.out.println(num2.nextInt());
    num2.close();

    
  }
}