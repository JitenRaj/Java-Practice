/* The break statement is used  for "Jump out" of a switch statement or
it can also be used to jump out of a loop */

public class _05_break_statement {
    public static void main(String[] args) {
        for ( int i = 0; i < 10 ; i++) {
            if ( i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}