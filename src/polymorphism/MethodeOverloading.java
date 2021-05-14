package polymorphism;

public class MethodeOverloading {

    // the class contains more then one methode with the same name with   arguments

    // method with parameter
    public void add(int a,int b){

    }
    // same methode name with diffrent number of  parameters
    public void add (int a,int b, int c){
        // this method call overloded method
        // same methode name with diffrent number of  parameters
    }
    public void add(String a, String b){
        // overloaded methode with diffrent type of parameters


    }

    public static void main(String[] args) {
        MethodeOverloading a=new MethodeOverloading();
      //  System.out.println(a.add(vishal,123););
    }


}
