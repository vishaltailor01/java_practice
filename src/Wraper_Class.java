public class Wraper_Class {

    public static void main(String[] args) {
        // data type
        // integer,double,char,boolean
        //
        // data conversion String to int
        String x = "100";
        System.out.println(x + 20); // string concatination
        int i = Integer.parseInt(x); // convert string to integer
        System.out.println(i + 20);

        // data conversion String to double
        String a = "10.0";
        System.out.println(a);
        double b = Double.parseDouble(a);
        System.out.println(b);

        // String to boolean
        String c = "false";
        System.out.println(c);
        boolean d = Boolean.parseBoolean(c);
        System.out.println(d);

        // int to String
        int ab = 200;
        System.out.println(ab + 200);
        String ac = String.valueOf(ab);
        System.out.println(ac + 200);

        // Exception Number Format exception
        // String u = "100A";
        // Integer.parseInt(u); //NumberFormatException: For input string: "100A"


    }
}
