/**
 * JV09_Constructor
 */
/**
 * Triangle
 */
public class JV09_Constructor {
    public static void main(String[] args) {
        JV09_Triangle TriangleA = new JV09_Triangle(15,2,4,5,7);
        double Area1 = TriangleA.findArea();
        System.out.println(Area1);

        JV09_Triangle TriangleB = new JV09_Triangle(15,2,4,5,7);
        double Area2 = TriangleB.findArea();
        System.out.println(Area2);
    }
}