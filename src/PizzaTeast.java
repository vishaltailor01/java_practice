public class PizzaTeast {


    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.capsicum();
        pizza.totmato();
        pizza.chees();
        pizza.onion();
        pizza.onion()
                .capsicum()
                .totmato()
                .chees();

    }
}
