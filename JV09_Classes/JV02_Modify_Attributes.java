/**
 * InnerJV02_Modify_Attributes
 */
class JV02_Attributes {
    int num1; // Attribute
    int num2 = 10; // Attribute
}
public class JV02_Modify_Attributes {
    public static void main(String[] args) {
        JV02_Attributes obj1 = new JV02_Attributes(); // Creating New Object
        JV02_Attributes obj2 = new JV02_Attributes(); // Creating New Object

        System.out.println("Previous value of num1 : "+ obj1.num1); // Accessing Attributes
        System.out.println("Previous value of num2 : "+ obj2.num2); // Accessing Attributes

        obj1.num1 = 20; // Modifying Attributes
        System.out.println("Modified value of num1 : "+ obj1.num1);

        obj2.num2 = 30; // Overriding existing values
        System.out.println("Overrided value of num2 : "+ obj2.num2);

    }
}
