/* The continue statement breaks one iteration ( in a loop ),
if a specified condition occurs , and continues with the next iterations 
in the loop */

public class _06_continue_statement {
    public static void main(String[] args) {
        for ( int i = 0 ; i < 10 ; i++ ) {
            if ( i==4 || i==6 ) {
                continue;
            }
            System.out.println(i);
        }
    }
}