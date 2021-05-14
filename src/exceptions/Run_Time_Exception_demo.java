package exceptions;

public class Run_Time_Exception_demo {
    public static void main(String[] args) {
        int a =10;
        int b=2;
        System.out.println("Program start");
        try {
            int divide=a/b;
            System.out.println("result :  " + divide);
            int [] numbers = {1,2,3,}; // another  exception example
            System.out.println(numbers[2]);
        }catch (Exception e){
            System.out.println(e.getMessage());
           // System.out.println(e.getMessage());
        }finally {
            System.out.println("This is finally block");

        }

        System.out.println("Programme End");
    }

}

