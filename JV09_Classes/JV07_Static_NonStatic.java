public class JV07_Static_NonStatic {
    // static method
    static void StaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // public method
    public void PublicMethod() {
        System.out.println("Public method must be called by creating object");
    }

    // main() function/method
    public static void main(String[] args) {
        // calling static method
        StaticMethod();

        // calling public method
        JV07_Static_NonStatic PMtest = new JV07_Static_NonStatic(); // Creating object
        PMtest.PublicMethod(); // and then calling Public Method
    }
}
