package Java.collection_hashset;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleHashSet {
    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<String>();

        setA.add("D");
        setA.add("B");
        setA.add("A");
        setA.add("C");
        setA.add("A");
        setA.add("B");

        Iterator<String> iterator = setA.iterator();
        while(iterator.hasNext()){
            System.out.println((String) iterator.next());
        }
        System.out.println("Display follow foreach");
        for (String element: setA) {
            System.out.println(element);
        }
    }
}
