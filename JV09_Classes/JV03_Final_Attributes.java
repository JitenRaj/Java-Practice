// If you don't want the ability to override existing values, declare the attribute as final:

public class JV03_Final_Attributes {
    int x = 5;
    final int y = 10;

    public static void main(String[] args) {
        JV03_Final_Attributes myObj = new JV03_Final_Attributes();
        myObj.x = 15; // We can modify this because its normal attribute/variable
        System.out.println(myObj.x);

        //TODO : Remove "//" from line 13 to make it work
        // myObj.y = 25; 
        // will generate an error: cannot assign a value to a final variable

        System.out.println(myObj.y);
    }
}
