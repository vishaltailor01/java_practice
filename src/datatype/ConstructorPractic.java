package datatype;

public class ConstructorPractic {
    // instance variable // global variable
    int a;
    String name;

    public ConstructorPractic(int a, String name) { // constructor local variable
        this.a = a; // local variable value assign to global variable
        this.name = name; // local variable value assign to instance variable

    }


    public void mymethod() {
        System.out.println(a); // global variable
        System.out.println(name); // global variable
    }
    public ConstructorPractic (int a,int b){
        ConstructorPractic obj = new ConstructorPractic(15,"vishal"); // calling constructor in constu

    }

    public static void main(String[] args) {
        ConstructorPractic obj = new ConstructorPractic(10, "vishal");
        obj.mymethod();



    }

}

