package datatype;

public class Method {


    public static void main(String[] args) {
        // create the object
        Test1 obj = new Test1();
        obj.addition();
        obj.add(11, 20); // value  can change any time
        int results = obj.subtraction();// need a print statment
        System.out.println(results); // print statment
        System.out.println(obj.abc()); // can call direct in a print
        System.out.println(obj.name()); //
        System.out.println(obj.add2(50, 50)); // can call with print with the value
        int c = obj.add2(100, 500); //  and can assign to variable as well and can given a new value .
        System.out.println(c);


    }

    //1- no return type with no parameters.
    // void is no return type
    // public is modifier
    // () parameters


    public void addition() {
        int a = 5; // local variable
        int b = 5; // local variables
        int x, y, z;

        System.out.println("Prime testing");

    }

    // 2 no return type with parameters

    public void add(int b, int a) { // int b and int a are local variable declare in parameters
        System.out.println(b + a);

    }
    // 3 with return type with no parameters
    // data type must match with declare data
    // must contain result key word

    public int subtraction() {
        int a = 20;
        int b = 5;
        int result = a - b;
        return result;

    }

    public String name() {
        String a = "vishal";
        return a; // must add a return

    }

    public Boolean abc() {
        boolean a = true;
        return a; // must add a return

    }

    // 4 with return type with parameters
    public int add2(int a, int b,String c) {

        int result = a + b;
        return result;  // must be add a return


    }

}


