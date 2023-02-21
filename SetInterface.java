package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface{
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set);

        for (Integer e : set){
            System.out.println(" " + e);

            System.out.println(set.isEmpty());
        }
    }
}

class SetTreeInterface{
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("murtaza");
        set.add("irfan");
        set.add("malik");

        System.out.println(" accessing elements using iterator" + set);
        Iterator<String> itr = set.iterator();
        while (itr.hasNext());
        String next = itr.next();
        System.out.println(next);
    }
}
