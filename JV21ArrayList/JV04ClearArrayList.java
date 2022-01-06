//package JV21ArrayList;

import java.util.ArrayList;

public class JV04ClearArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<5; i++){
            arrayList.add(i+1);
        }

        System.out.println(arrayList);

        arrayList.clear();

        System.out.println(arrayList);
    }
}
