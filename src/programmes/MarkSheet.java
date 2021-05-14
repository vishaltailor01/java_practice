package programmes;

import java.util.Scanner;

public class MarkSheet {
    public static void main(){


        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the student name : \t");// \n for new line and \t for tab
        String name =input.next();

        System.out.println("\nenter student roll number : \t");
        int roallNumber = input.nextInt();

        System.out.println("Enter Marks of Subject Meths : \t");
        int mathsMarks = input.nextInt();
        if (mathsMarks<0 || mathsMarks>100){
            System.out.println("invalid input");
            System.out.println("\n Please enter correct marks \t \t :");
            mathsMarks = input.nextInt();
        }

        System.out.println("Enter Marks of Subject Science : \t");
        int science = input.nextInt();
        if (science<0 || science>100){
            System.out.println("invalid input");
            System.out.println("\n Please enter correct science \t \t :");
            science = input.nextInt();
        }
        System.out.println("Enter Marks of Subject English : \t");
        int english = input.nextInt();
        if (english<0 || english>100){
            System.out.println("invalid input");
            System.out.println("\n Please enter correct marks \t \t :");
            english = input.nextInt();
        }



    }
}
