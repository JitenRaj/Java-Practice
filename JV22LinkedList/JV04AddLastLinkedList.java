import java.util.LinkedList;

public class JV04AddLastLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        // AddLast will add elements to the end of the list
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println(list);
    }
}
