package AlgoritmyStructure;

import java.util.*;

public class CollectionsList {
    public static void main(String[] args) {

        /*********************ARRAY_LIST************************************/
        List<String> mylist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mylist.add(String.format("%02d", i));
        }

        System.out.println(mylist);
        for (String s : mylist) {
            if (s.contains("07")) {
                mylist.set(mylist.indexOf("07"), "****Тут был 07****");
            }
        }
        System.out.println(mylist);

        /*******************LINKED-LIST*************************************************/
        LinkedList<String> mylinkedlist = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            mylinkedlist.add(i, String.format("%03d", i));
        }
        System.out.println(mylinkedlist);
        mylinkedlist.remove(mylinkedlist.indexOf("007"));
        System.out.println(mylinkedlist.getFirst());
        System.out.println(mylinkedlist);
        mylinkedlist.removeFirst();
        System.out.println(mylinkedlist.getLast());

        /******************COLLECTIONS*********************************************/
        Collections.sort(mylinkedlist, (o1, o2) -> -o1.compareTo(o2));
        System.out.println(mylinkedlist);


        /*********************ITERATOR******************************************/
        Iterator iter = mylinkedlist.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}




