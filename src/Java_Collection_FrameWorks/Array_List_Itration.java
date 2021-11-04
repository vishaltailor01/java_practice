package Java_Collection_FrameWorks;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Itration {
    public static void main(String[] args) {
        ArrayList<String> studentlist = new ArrayList<String>();
        studentlist.add("Tom");
        studentlist.add("Vishal");
        studentlist.add("Hiral");
        studentlist.add("Hiya");


        // typical for loop

        for(int i=0;i<studentlist.size();i++){
            System.out.println(studentlist.get(i));
        }
        System.out.println("====================");
        // for each loop
        for(String s : studentlist){
            System.out.println(s);
        }
        System.out.println("====================");

        // jdk 8 - streams with lambda:
        studentlist.stream().forEach(ele -> System.out.println(ele));
        System.out.println("====================");
        // iterator
        Iterator <String> it = studentlist.iterator();
        // while loop
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
