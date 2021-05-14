package encapsulation;

public class Test_Encapsulation {
    public static void main(String[] args) {
        Encapsulation_demo obj =new Encapsulation_demo();
        obj.setId(5);
        obj.setName("Prime");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
