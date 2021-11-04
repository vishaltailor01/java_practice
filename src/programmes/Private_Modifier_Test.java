package programmes;

public class Private_Modifier_Test {

    private int a = 1;
    private String b = "Vishal";

    int geta() {
        return a;
    }

    String getb() {
        return b;
    }

    void seta(int a) {
        this.a = a;


    }

    void setb(String b) {
        this.b = b;
    }

    int getaddresult() {
        return this.a;
    }

    String getresult() {
        return this.b;
    }




}




