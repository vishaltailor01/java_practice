package polymorphism;
// construction overloading

public class ConstructionOverloading {
    int a;
    String  b;
    String c;

    public ConstructionOverloading(int a) {
        this.a = a;
    }

    public ConstructionOverloading(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public ConstructionOverloading(int a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public ConstructionOverloading(String b) {
        this.b = b;
    }
}
