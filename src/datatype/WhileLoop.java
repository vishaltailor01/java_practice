package datatype;

public class WhileLoop {
    // when we want to execute group of statement repeatedly or more number of time then while loop is used.
    public static void main(String[] args) {

       int i = 0;

        while (i < 10) {

            System.out.println(i);
            i++; // condition is required
        }
        System.out.println("---------------");
        System.out.println("---------------");

        int a = 10;

        while (a > 0) {

            System.out.println(i);
            a--; // condition is required
        }
        System.out.println("----------------");
        System.out.println("----------------");

        int b = 10;

        while (b > 1) {
            if (b != 5)
                System.out.println(i);
            b--; // condition is required

        }
        while (true) {

            System.out.println("pass");
            break;
        }


// print out reverse number
        String ac = "Hello world";
        ac.hashCode();

       int  ab = ac.length();
        int rev = 0;
        while (ab>0){
            rev=(rev*10)+ab%10;
            a= ab/10;

        }
        System.out.println(rev);


    }
}
