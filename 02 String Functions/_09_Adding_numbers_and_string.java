/**
 * Adding numbers and string
 */
public class _09_Adding_numbers_and_string {
    public static void main(String[] args) {
        // addition of two numbers
        int num1 = 10;
        int num2 = 20;
        int sum1 = num1 + num2;
        System.out.println(sum1);

        // addition of two strings
        String str1 = "10";
        String str2 = "20";
        String str_add = str1 + str2;
        System.out.println(str_add);

        //addition of numbers and strings
        String str3 = "10";
        int num3 = 20;
        String sum3 = str3 + num3;
        System.out.println(sum3);

        /*this block will throw error cause strings are immutable in java
        and strings cannot be converted into integers

        int sum4 = str3 + num3;
        System.out.println(sum4);

        */
    }
}