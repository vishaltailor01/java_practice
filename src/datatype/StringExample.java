package datatype;

public class StringExample {



    public static void main(String[] args) {

        String name="This is my string";
        String name1 ="Hello World";

        System.out.println("the lenght of string is " + name.length());
        System.out.println("is this string  empty :" + name.isEmpty());
        System.out.println(name.charAt(3));
        System.out.println(name.equals(name1)); // false
        System.out.println(name.contains("x")); // false

    }

}
