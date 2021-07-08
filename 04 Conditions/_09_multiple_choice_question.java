/**
 * _09_multiple_choice_question
 */
import java.util.Scanner;

public class _09_multiple_choice_question {
    public static void main(String[] args) {
        String Question1 = "which city is known as pink city?";
        String choise1 = "Bikaner";
        String choise2 = "Jaipur";
        String choise3 = "Jodhpur";
        String choise4 = "Jaisalmer";

        String correctAnswer1 = choise2;

        Scanner input = new Scanner(System.in);

        System.out.println(Question1 + "\n" + choise1 + "\n" + choise2 + "\n" + choise3 + "\n" + choise4);

        System.out.print("Enter your Answer here : ");

        String input1 = input.next();

        if ( correctAnswer1.equals(input1) ) {
            System.out.println("Yey Congrats! This is Correct Answer");
        } else {
            System.out.println("This is Wrong Answer");
            System.out.println("Correct Answer is " + correctAnswer1);
        }

        input.close();
    }
}