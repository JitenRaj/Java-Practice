//package JV21ArrayList;

import java.util.ArrayList;

public class JV06UpdateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<5; i++){
            arrayList.add(i+1);
        }

        System.out.println(arrayList);

        for(int i=0; i< arrayList.size(); i++){
            arrayList.set(i, arrayList.get(i)*10);
        }

        System.out.println(arrayList);
    }
}
