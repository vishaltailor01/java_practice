package polymorphism;

public class Child extends Parent {
    public void add(int a , int b){
        super.add(a,b); // overriding method

        System.out.println(a-b);


    }

    @Override
    public void merry() { // overiding concept
       // super.merry();
        System.out.println("Beautifull white girl");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.add(10,5);
        Child a = new Child();
        a.merry();






    }


}
