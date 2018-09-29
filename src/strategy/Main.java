package strategy;

public class Main {
    public static void main(String[] args) {

        Household mrJohnsonFamily = new BigHousehold();
        mrJohnsonFamily.setDishWashingInterface(new DishwasherWashing());
        mrJohnsonFamily.setClothesWashingInterface(new MachineWashing());
        mrJohnsonFamily.washClothes();
        mrJohnsonFamily.washDishes();
        mrJohnsonFamily.washDishes();
        mrJohnsonFamily.washDishes();
        System.out.println(mrJohnsonFamily.getUsageOfWater());
        ((BigHousehold) mrJohnsonFamily).giveABirth();

    }
}
