public class JV05_Multiple_Attributes {
    // Declaring multiple attributes in same class itself
    int myAge = 21;
    String firstName = "Jitendra Singh";
    String lastName = "Rajpurohit";

    public static void main(String[] args) {
        JV05_Multiple_Attributes obj1 = new JV05_Multiple_Attributes();
        // assigning attributes to local variables
        // assigning multiple attributes in single object
        String fname = obj1.firstName;
        String lname = obj1.lastName;
        int age = obj1.myAge;

        System.out.println("Hello, My name is " + fname + " " + lname);
        System.out.println("I am " + age);

    }
}
