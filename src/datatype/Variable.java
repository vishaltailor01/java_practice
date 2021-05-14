package datatype;

public class Variable {
    // variable:- variable are use to store the value into memory.
     /* class contains
    1 variables
    2 methode
    4 instance blocks
    5 ststic blocks
     */
    /* Local Variables:- variable which are declare inside methode ,in side constructor or inside block  are call local varibles
     */
    // local variable :- Scope inside the methode , inside the constructore or inside the block

    // instance variables :- variables which are declared inside the class but outside the methode are called instance variables
    // Scope - acrose the class but into instance area

    // following variables is instance variables


    int b = 5;
    String names1 = "Priem";

// Static variabls - variables which are declare in side the class , out side the methode with static key word is called static variable
    // scope- across the class or which the class

    static int c = 10;
    static String names2 = "Prime";

    // declare the variable in main methode call local variables
    // main methode are predefine methode
    public static void main(String[] arga) {

        // Local variables
        // can not out side the methode
        int a = 10; // 10 is assigned to variable a =
        String names = "Amit"; // name is a variable

        System.out.println(a);// variable a is called to the print statement
        System.out.println(names); // variable a is called to the print statement
        //System.out.println(b);
        System.out.print(a);
        System.out.print(names);


    }


    // user defined methode :- user declare methode
    void add() {
        // x and y are local variables
        int x = 5;
        int y = 2;

        System.out.println(b);
        System.out.println(x);
    }


// constructore

    Variable() {

        String name = "Amit";
        char d = 'a';

        // instance block
        {
            String x = "k";

        }

        // statics blocks
        boolean result = true;


    }


}
