public class JV10_Modifier_Final {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        JV10_Modifier_Final myObj = new JV10_Modifier_Final();
        myObj.x = 50; // will generate an error: cannot assign a value to a final variable
        myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
  }
}
