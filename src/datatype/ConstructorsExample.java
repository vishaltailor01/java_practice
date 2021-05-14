package datatype;

public class ConstructorsExample {
    // constructor
    // zero argument constructors
    public ConstructorsExample() {
        System.out.println("zero arguments constructor created by user ");


    }

    // one args constructor
    public ConstructorsExample(int a) {
        System.out.println("one arguments constructor created by user ");

    }

    public ConstructorsExample(int a, int b) {
        System.out.println("two arguments constructor created by user ");

    }
    // one are constructor
    public ConstructorsExample(String name) {
        System.out.println("one string arguments constructor created by user ");


    }



    // method
    //  public void add() {

    //}
    // return mehthod
    // public int add(){

    //}
    public static void main(String[] args) {

        ConstructorsExample obj = new ConstructorsExample(); //  zero argument construction call in main method
        System.out.println(obj);
        ConstructorsExample obj1 = new ConstructorsExample(10); //  one argument construction call in main method
        ConstructorsExample obj2 = new ConstructorsExample(10, 30); //  two argument construction call in main method
        ConstructorsExample obj3 = new ConstructorsExample("prime"); //  one  argument construction call in main method

    }


}
