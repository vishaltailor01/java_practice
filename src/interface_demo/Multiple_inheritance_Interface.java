package interface_demo;

// interface
interface A {
    int a = 100;
    int aa = 200;

    void add();
}

// interface
interface B {
    int b = 200;
    int bb = 300;

    void subtract();

}
// multiple inheritance can be done by only with interface
// implements interface to class by implements key word
public class Multiple_inheritance_Interface implements A, B {

    // call the interface method
    public void add() {
        System.out.println(a + aa);
    }
// cal the interface method
    public void subtract() {
        System.out.println(bb - b);

    }

    public static void main(String[] args) {
        // create a object
        Multiple_inheritance_Interface obj = new Multiple_inheritance_Interface();
        // call  the method
        obj.add();
        // call the method
        obj.subtract();


    }
}
