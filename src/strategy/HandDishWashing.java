package strategy;

public class HandDishWashing implements DishWashingInterface {

    @Override
    public int washDishes() {
        System.out.println("Ough, my skin is irritated!");
        return 15;
    }
}
