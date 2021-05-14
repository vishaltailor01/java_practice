package Java_Collection_FrameWorks;

public class Array_Demo {

    public static void main(String[] args) {
        // disadvantage of arrays
        // 1 size is fixed -- static arrays
        // 2 stores only similar data types === to over come this problem, we use object arrays

        int[] a = new int[5]; // declared array with size 5, starting index is 0, last index is 4

        a[0] = 100;  // storing // inserting values in to array
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;
        System.out.println(a[0]);  // for specific  value

        int b[] = {100, 200, 300, 400, 500,}; // declare array without specifying size
        System.out.println("length of array " + b.length); // print length or size of array
        System.out.println(b[2]); // read the specific value

        // double arrays
        double d []= new double[5];
        d[0]=100;
        d[1]=200;
        d[2]=300;
        d[3]=400;
        d[4]=500;
        System.out.println(d.length);
        System.out.println(d[3]);

        // Object arrays
        Object ab [] = new Object[6];
        ab [0] = "tom";
        ab[1]=25;
        ab[2]=12.33;
        ab[3]="1/1/1990";
        ab[4]='M';
        ab[5]="london";
        System.out.println(ab[5]);
        System.out.println(ab.length);







    }
}
