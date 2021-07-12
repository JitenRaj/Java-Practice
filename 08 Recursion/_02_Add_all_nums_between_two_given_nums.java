import java.util.Scanner;

public class _02_Add_all_nums_between_two_given_nums {
    public static void main(String[] args) {
        System.out.println("Enter two numbers to add sum of all numbers between then: ");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting number : ");
        int start = input.nextInt();
        System.out.println("Enter the ending number : ");
        int end = input.nextInt();

        int result = sum(start, end);
        System.out.println("Sum of all numbers between " + start + " and " + end + " is " +result);
        input.close();
      }
      public static int sum(int start, int end) {
        if (end > start) {
          return end + sum(start, end - 1);
        } else {
          return end;
        }
      }
}
