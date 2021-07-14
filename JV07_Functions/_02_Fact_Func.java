public class _02_Fact_Func {
    public static int fact(int x) {
        if ( x < 2) {
            return 1;
        }
        else {
            return x*fact(x-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
