package interface_demo;

public class Test implements Calculator {

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void sub(int x, int y) {
        System.out.println(x-y);

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.add(10,50);
        t.sub(50 ,5);
    }
}
