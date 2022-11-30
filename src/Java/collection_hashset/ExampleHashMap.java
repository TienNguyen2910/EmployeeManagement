package Java.collection_hashset;

import java.util.HashMap;

public class ExampleHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"Java");
        map.put(2,"PHP");
        map.put(3,"Android");
        map.put(2,"C#");
        System.out.println("Cac khoa hojc lap trinh tai NIIT: "+map);
        System.out.println("In ra phan tu thu 2: "+ map.get(2));
    }
}
