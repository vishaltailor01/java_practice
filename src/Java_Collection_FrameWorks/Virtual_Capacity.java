package Java_Collection_FrameWorks;

import java.util.ArrayList;

public class Virtual_Capacity {
    public static void main(String[] args) {

// virtual capacity is default 10
        ArrayList<Object> ar = new ArrayList<Object>();
        System.out.println(ar.size()); // physical capacity is 0
        ar.add(200);
        System.out.println(ar.size());


    }
}
