package programmes;

public class Test {
    public static void main(String[] args) {
        String s1="Hello";
        s1.concat("world");
        System.out.println("String Object:" + s1);
        StringBuffer s2 =new StringBuffer("Hello");
        s2.append("World");
        System.out.println("String Buffer Object;"+s2);
    }

    private Test(){

    }

}
