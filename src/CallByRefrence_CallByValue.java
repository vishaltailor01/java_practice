public class CallByRefrence_CallByValue {
    int a; // global variable
    int b; // globle variable


    public static void main(String[] args) {
        CallByRefrence_CallByValue obj = new CallByRefrence_CallByValue();
        int x = 10; // local variable
        int y = 20; // local variable
        obj.testSum(x,y); // call by value OR pass by value
       // obj.testSum(10,20);

        obj.a =50;
        obj.b=60;
        obj.swap(obj);

        // after swap
        System.out.println(obj.a);
        System.out.println(obj.b);



    }
    public  int testSum(int a , int b){

        int c =a+b;
        return c;
    }
// called by reference
    public void swap (CallByRefrence_CallByValue t){
        int temp;
        temp=t.a; // temp= 50
        t.a= t.b; // t.a =60
        t.b =temp; // t.b = 50


    }
}
