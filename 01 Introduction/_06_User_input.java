import java.util.Scanner;

public class _06_User_input {
  public static void main(String[] args) {
    System.out.println("enter a number :");
    Scanner myVar = new Scanner(System.in);
    System.out.println(myVar.nextLine());
    myVar.close();
  }
}