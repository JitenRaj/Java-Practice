import java.util.Scanner;

public class _03_if_else {
  public static void main(String[] args) {
    int age;
    System.out.println("Enter your age: ");
    Scanner agescan = new Scanner(System.in);
    age = agescan.nextInt();

    if (age<16) {
      System.out.println("Too Young");
    } else {
      System.out.println("Welcome");
    }
  }
}
