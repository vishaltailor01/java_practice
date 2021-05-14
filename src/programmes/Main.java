package programmes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //Scanner input= new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = input.nextInt();
        System.out.println("Enter second number :   ");
        int b = input.nextInt();
        double result;
        Calculator obj = new Calculator();
        result=obj.addition(a,b);
        System.out.println("This is addition of two numbers : " + result);

    }
}
