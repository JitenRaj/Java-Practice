/* If you create multiple objects of one class, 
you can change the attribute values in one object,
without affecting the attribute values in the other: */

class Attributes {
    int num1 = 5; // Attributes/variables
}

public class JV04_Multiple_Objects {
    public static void main(String[] args) {
        Attributes obj1 = new Attributes(); // Creating object 1
        Attributes obj2 = new Attributes(); // Creating object 2

        System.out.println(obj1.num1); // 5
        System.out.println(obj2.num1); // 5

        obj1.num1 = 10;

        System.out.println(obj1.num1); // 10
        System.out.println(obj2.num1); // 5

    }
}
