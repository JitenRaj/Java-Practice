public class _03_Change_Array_element {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        // Changing array element
        cars[0] = "Opel";
        System.out.println(cars[0]);
        // Now outputs Opel instead of Volvo
    }
}
