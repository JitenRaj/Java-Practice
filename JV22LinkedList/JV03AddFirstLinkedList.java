import java.util.LinkedList;

public class JV03AddFirstLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        
        // addFirst will add items at 0th index and move other elements to the +1 to
        // their previous position

        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        
        System.out.println(list);

        list.addFirst(5);
        list.addFirst(6);

        System.out.println(list);
    }
}
