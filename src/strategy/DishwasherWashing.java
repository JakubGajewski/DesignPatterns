package strategy;

public class DishwasherWashing implements DishWashingInterface {
    @Override
    public int washDishes() {
        System.out.println("Tshhhh, dishwasher is working");
        return 10;
    }
}
