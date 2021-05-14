package Java_Collection_FrameWorks;

import java.util.Hashtable;

public class Hash_Table_Concept {

    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put("A","test");
        h.put("B","Hello");
        h.put("c","World");

        System.out.println(h.size());

        h.put(10,200);
        h.put(20,300);

        System.out.println(h.size());

        h.put(3,"Tom");
        h.put(4,"sai");

        System.out.println(h.size());
        System.out.println(h.get(4));
        System.out.println(h.get("c"));


        Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();

        h1.put(1,100);

        Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
        h2.put(1,"Sai");



    }
}
