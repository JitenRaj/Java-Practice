import java.util.LinkedList;

public class JV05RemoveLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        for(int i = 0; i < 10; i++) {
            list.add(i*2);
        }

        System.out.println("List: " + list);
        
        // it will remove First element by default

        list.remove(); 
        System.out.println("after remove() : " + list);

        list.remove(); 
        System.out.println("after remove() : " + list);

        // it will remove element at given index index

        list.remove(5); 
        System.out.println("after removing 5th element : " + list);

        list.remove(3);
        System.out.println("after removing 3rd element : " +list);

        // it will remove element equivalent to given object

        list.remove(Integer.valueOf(6)); 
        System.out.println("after removing 6 : " +list);

        list.remove(Integer.valueOf(16));
        System.out.println("after removing 16 : " +list);
    }
}
