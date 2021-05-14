package encapsulation;

public class Encapsulation_demo {
    private int id;
    private  String name;

    // getter method
    /*public int getId(){
        return id;
    }
    // setter method
    public void setId(int id){
        this.id=id;
    }
    // getter method
    public String getName(){
        return name;
    }
    // setter method
    public void setName(String name){
        this.name=name;
    }*/
// short cut to altr+insert for setting methode
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
