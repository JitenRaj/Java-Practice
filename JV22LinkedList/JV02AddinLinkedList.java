import java.util.LinkedList;

public class JV02AddinLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(Integer.valueOf(5));
        list.add(20);
        
        System.out.println(list);

        list.add(1, 10);
        System.out.println(list);

        list.add(2, 15);
        System.out.println(list);
    }
}
