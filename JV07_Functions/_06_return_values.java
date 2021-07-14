public class _06_return_values {
    static int myMethod(int x) {
        return 5 + x;
    }
    
    public static void main(String[] args) {
        System.out.println(myMethod(3));
        System.out.println(myMethod(6));
        System.out.println(myMethod(9));
        System.out.println(myMethod(12));

    }
}
