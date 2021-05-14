package Java_Collection_FrameWorks;

import java.util.ArrayList;

public class ArraysList_Concept {
    public static void main(String[] args) {

        ArrayList ar = new ArrayList();
        ar.add(100); // index 0
        ar.add(100); // index 1
        ar.add(100); // index 2
        System.out.println(ar.size());

        ar.add(100); // index 3
        ar.add("Hi"); // index 4
        ar.add('v'); // index 5
        ar.add(12.33); // index 6
        System.out.println(ar.size());

        ar.add(true); // index 7
        ar.add(2); // index 8
        ar.add("sai"); // index 9

        System.out.println(ar.size());
        ar.remove(6); // to remove any index
        System.out.println(ar.get(7));
        // System.out.println(ar.get(9)); // IndexOutOfBoundsException: Index: 9, Size: 9

        // to print all value of Array list or Array need to use for loop.

        for (int i = 0; i < ar.size(); i++) { // for array i need to use .length method
            System.out.println(ar.get(i));

        }

// to declare particular data type arraylist
        ArrayList<Integer> ar1=new ArrayList<Integer>();
        ar1.add(100);
        ar1.add(200);

        ArrayList<String>ar2 = new ArrayList<String>();
        ar2.add("vishal");
        ar2.add("Tailor");




    }
}
