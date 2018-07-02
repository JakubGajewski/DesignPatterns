package builder;

public class Main {
    public static void main(String[] args) {
        Pizza.Builder pizzaBuilder = new Pizza.Builder(Size.BIG, "thin", "hot");
        pizzaBuilder.meat("chicken");
        Pizza pizza = pizzaBuilder.build();

        System.out.println(pizza.toString());
    }
}
