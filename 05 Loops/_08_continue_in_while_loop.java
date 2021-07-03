// Using continue statement in while loop to print odd numbers

public class _08_continue_in_while_loop {
    public static void main(String[] args) {

        // odd number

        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println("Odd number " + i);
            i++;
        }
    }
}