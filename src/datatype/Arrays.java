package datatype;

public class Arrays {

    // arrays example

    public static void main(String[] args) {
        // single dimension array

        int[] x;
        int y[];
        int s[] = {10, 50, 20, 30, 40, 50, 4, 55, 66, 55,};
        String name[] = {"vishal", "sweta", "manish", "surekha"};
        System.out.println(name[1]);
        System.out.println(name[0]);
        System.out.println(name[3]);
        int[] z = new int[5];// new approach of declare array
        z[0] = 10;
        z[1] = 10;
        z[2] = 16;
        z[3] = 1;
        z[4] = 15;
        // System.out.println(java.util.Arrays.toString(z));
        // Object arrays
        // can store any data type in same arrays
        Object ab[] = new Object[6];
        ab[0] = "tom";
        ab[1] = 25;
        ab[2] = 12.33;
        ab[3] = "1/1/1990";
        ab[4] = 'M';
        ab[5] = "london";
        System.out.println(ab[5]);
        System.out.println(ab.length);

        // 2d arrays (Two Dimensional Arrays)
        String arrays[][] = new String[3][5];
        System.out.println(arrays.length); // total numbers of rows = 3
        System.out.println(arrays[0].length); // total numbers of colu = 5
        // [first row] and [colume]
        arrays[0][0] = "A";
        arrays[0][1] = "B";
        arrays[0][2] = "c";
        arrays[0][3] = "D";
        arrays[0][4] = "E";
        // 2nd  row
        arrays[1][0] = "Ab";
        arrays[1][1] = "Bc";
        arrays[1][2] = "Cd";
        arrays[1][3] = "De";
        arrays[1][4] = "Ef";
        // 3rd row
        arrays[2][0] = "Aa";
        arrays[2][1] = "Bb";
        arrays[2][2] = "cc";
        arrays[2][3] = "Dd";
        arrays[2][4] = "Ee";
        System.out.println(arrays[1][2]);
        System.out.println(arrays[2][2]);
        System.out.println(arrays[0].length);
        // print all the values of 2d arrays
        // need to use for loops
        for (int row = 0; row < arrays.length; row++) {
            for (int col = 0; col < arrays[0].length; col++)
                System.out.println(arrays[row][col]);
        }


    }
}
