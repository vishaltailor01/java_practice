package inheritance;

public class B extends A {
    public void m3() {
        System.out.println("chid class me method");
    }

    public void m4() {
        System.out.println("child class m4 method");
    }

    public static void main(String[] args) {
        B b = new B(); // child class object of class B
        b.m3();
        b.m4();
      //  b.m1();// parent class
        b.m2();// parent class

        A a = new A(); // child class object of A
        a.m2();
       // a.m1();
        a.m1();

        

    }
}
