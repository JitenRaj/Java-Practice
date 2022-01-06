//package JV21ArrayList;

import java.util.ArrayList;

/**
 * JV03RemoveFromArrayList
 */
public class JV03RemoveFromArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<5; i++){
            arrayList.add(i+1);
        }

        for(int i=0; i<5; i++){
            System.out.println(arrayList);
            arrayList.remove(0);
        }
    }
}