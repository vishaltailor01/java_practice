package Java_Collection_FrameWorks;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_Demo {
    public static void main(String[] args) {
        // hashmap object
        // HashMap h =new HashMap();
        //another way to declare hashmap for specific   data
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        h.put(1, "test");
        h.put(2, "Hello");
        h.put(5, "World");

        System.out.println(h.size());

        h.put(7, "om");
        h.put(6, "hi");

        System.out.println(h.size());

        h.put(3, "Tom");
        h.put(4, "sai");

        System.out.println(h.size());
        System.out.println(h.get(4)); // give to a value of the key
        System.out.println(h.get("c"));
        System.out.println(h); // print the key and value

        // h.remove(5); remove key.
        //  h.containsKey(5);// give you boolean answer.
        h.containsValue(1); // give you boolean answer.
        h.isEmpty(); // check the hashmap is empty or not.


        System.out.println(h.keySet()); // return all key as a set.
        // can do it with the for loop to get he individual object
        for (int i : h.keySet()){
            System.out.println(i);
        }
        System.out.println(h.values());  // return all value as a collection.
        // can do it with the for loop to get he individual object
        for (String i : h.values()){
            System.out.println(i);
        }



        // another way to get  the same data
        for (Object i : h.keySet()){
            System.out.println(i + "  :\t "+ h.get(i));
        }


        // Entry Methods
        System.out.println(h.entrySet());// give you all entry as a set.
        // can do it with the for loop to get he individual object
        for (Map.Entry i : h.entrySet()) {
            System.out.println(i.getKey() +"\t"+ i.getValue());


        }


    }
}
