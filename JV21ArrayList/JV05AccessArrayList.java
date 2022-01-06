//package JV21ArrayList;

import java.util.ArrayList;

public class JV05AccessArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new  ArrayList<>();

        System.out.println(arrayList);

        for(int i=0; i<5; i++){
            arrayList.add(i+1);
            System.out.println(arrayList.get(i));
        }

        System.out.println(arrayList);
    }
}
