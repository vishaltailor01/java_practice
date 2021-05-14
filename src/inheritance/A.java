package inheritance;

public class A {

    // parent class
     void m1(){
        System.out.println("Parent class m1 method");
    }

    private int ab=10;

    public void m2(){

        System.out.println("parent cladd m2 method");
    }

    public static void main(String[] args) {
        A a = new A();// create object
        a.m1();
        a.m2();

    }
}
