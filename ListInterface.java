package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);

      /*  System.out.println("list is :" + list);

      Integer get =  list.get(3); // get random access elements from list

        System.out.println("random access :" +get);

        list.set(3,100); // change elements from list

        System.out.println(list);

        list.remove(1);

        System.out.println(" remove elements" +list);



        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext());
        Integer next    = iterator.next();
        System.out.println(" using iterator to print list :" + next);

       */


        for (Integer e : list){
            System.out.println(e);
        }
    }
}
