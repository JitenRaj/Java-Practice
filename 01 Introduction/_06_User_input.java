// User input

import java.util.Scanner;

public class _06_User_input {
  public static void main(String[] args) {
    System.out.println("enter a number :");
    Scanner myVar = new Scanner(System.in);
    System.out.println("number entered is =" + myVar.nextLine());
    myVar.close();
  }
}