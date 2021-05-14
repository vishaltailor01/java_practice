package datatype;

public class InstanceArea {

    int a = 1; // instance variable - relate to object
    static String name = "Vishal"; // static variable - relate to class


    // main methode is static
    public static void main(String[] args) {
// static area
        // create an object
        // syntex for object creation :- classname object-name = new classname();
        InstanceArea obj = new InstanceArea(); // object name should be meaning full
        // test t = new test();
        // Datatype dt=new Datatype();
        // HelloWorld ht=new HelloWorld();

        System.out.println(obj.a);
        System.out.println(name);
        obj.m1();
        m2();

    }
    // calling - instance variable to instance area you can call - direct
    // calling- static variable to static area you can call - direct
    // calling- instance variable to static area a you can call - via object
    // calling- static to instance variable  area you can call - via class name


    // instance methode
    void m1() {
// instance area
        int x = 10;// local variable
        System.out.println(a);
        System.out.println(name);
        System.out.println(InstanceArea.name);
        // ststic method m2 called into instance are via direct and with class name
        //InstanceArea.m2();

    }

    // static methode
    static void m2() {
        int y = 5;// local variable
        System.out.println(y);
        System.out.print(name);
        // created new object
        InstanceArea obj = new InstanceArea();
        System.out.println(obj.a);// instance variabl a is called in static area (static methode)
        obj.m1();

    }


}
