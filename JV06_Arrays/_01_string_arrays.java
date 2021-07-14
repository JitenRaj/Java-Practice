public class _01_string_arrays {
    public static void main(String[] args) {
        // Declaring a String Array and initializing it
        // inserts values using array literal method 
        String[] cars = {"audi", "maruti", "suzuki", "ford" };

        // printing value of index 0
        System.out.println(cars[0]);

        // replacing value of index 0
        cars[0] = "tesla";

        // printing new value of index 0 again
        System.out.println(cars[0]);
    }
}