package Access_modifiers;
/* Access Modifiers
 * PRIVATE :- ACCESSIBLE ONLY WITHIN THE CLASS.
 * DEFAULT :- DEFAULT MEANS VARIABLE AND METHODE DECLARE WITH OUT ANY MODIFIERS
 *            ACCESSIBLE ONLY WITHIN THE PACKAGE.
 * PUBLIC  :- ACCESSIBLE
 * PROTECTED :- ACCESSIBLE WITHIN THE PACKAGE AND OUTSIDE OF THE PACKAGE BUT THROUGH INHERITANCE.
 */

class A {

    // PRIVATE VARIABLE AND METHOD
    private int ab = 10; // private Access modifier variable  and method scope is with in a class

    private void m1() {
        System.out.println(ab);
    }

    // DEFAULT :- DEFAULT MEANS VARIABLE AND METHODE DECLARE WITH OUT ANY MODIFIERS
//            ACCESSIBLE ONLY WITHIN THE PACKAGE.
    // DEFAULT VARIABLE AND METHODE
    int ab1 = 10; // private Access modifier variable  and method scope is with in a class

    void m12() {
        System.out.println(ab);
    }

    public class Access_Modifiers_example {


    }

    public class B {
        // PROTECTED :- ACCESSIBLE WITHIN THE PACKAGE AND OUTSIDE OF THE PACKAGE BUT THROUGH INHERITANCE .
        // protected method and variable .
        protected int a = 100;

        protected void m2() {

        }
    }

    public static void main(String[] args) {
        A aa = new A();
        // aa.ab; cannot access because it s private variable
        // aa.m1; cannot access because its private variable
        aa.m12(); // can access because its default method


    }
}
