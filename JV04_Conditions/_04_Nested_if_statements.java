import java.util.Scanner;

public class _04_Nested_if_statements {
  public static void main(String[] args) {
    int age;

    System.out.println("Enter your age:");
    Scanner agescan = new Scanner(System.in);
    age = agescan.nextInt();
    agescan.close();
    
    if (age > 0) {
      if (age > 16) {
        System.out.println("Welcome");
      } else {
        System.out.println("Too Young");
      }
    } else {
      System.out.println("Error");
    }
  }
}
