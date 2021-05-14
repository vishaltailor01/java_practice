package Java_Collection_FrameWorks;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_Vs_Arraylist {
    public static void main(String[] args) {

        // static list
        int i[]=new int[4];
        i[0]=100;
        System.out.println(i[0]);
        System.out.println(i[3]); //give you default value 0

        // array list is default class
        // dynamic array
        // default generics
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
        System.out.println(ar.get(9));
       // System.out.println(ar.get(10)); // Exception
        System.out.println(ar);
        System.out.println("Lowest index value " + 0);
        System.out.println("highest index value "+ (ar.size()-1));

        // list with other collections
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50,6,12));
        System.out.println(numbers);
        System.out.println(numbers.size());
        ArrayList<String> name = new ArrayList<String>(Arrays.asList("hi","java","Programme"));
        System.out.println(name);
        System.out.println(name.size());
        ArrayList<Double> numbers1 = new ArrayList<Double>(Arrays.asList(10.00,20.20,30.00,40.20,50.60,12.00));
        System.out.println(numbers1);
        System.out.println(numbers1.size());


    }
}
