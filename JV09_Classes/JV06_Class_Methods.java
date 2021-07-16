/**
 * JV06_Class_Methods
 */
public class JV06_Class_Methods {
    // creating method outside main()
    static void test() {
        System.out.println("Hello world");
    }
    public static void main(String[] args) {
        // calling that method inside main()
        test();
    }
}