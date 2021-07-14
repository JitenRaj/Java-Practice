import java.util.Scanner;
public class _05_else_if_statement {
  public static void main(String[] args) {
    int age;

    System.out.println("Enter your age:");
    Scanner agescan = new Scanner(System.in);
    age = agescan.nextInt();
    agescan.close();

    if (age < 0) {
        System.out.println("Error");
      } else if(age>0 && age <16) {
        System.out.println("Too Young");
      } else {
      System.out.println("Welcome");
    }
  }
}
