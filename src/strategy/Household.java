package strategy;

public abstract class Household {

    private int usageOfWater;

    private DishWashingInterface dishWashingInterface;
    private ClothesWashingInterface clothesWashingInterface;

    public int getUsageOfWater() {
        return usageOfWater;
    }

    public void setDishWashingInterface(DishWashingInterface dishWashingInterface) {
        this.dishWashingInterface = dishWashingInterface;
    }

    public void setClothesWashingInterface(ClothesWashingInterface clothesWashingInterface) {
        this.clothesWashingInterface = clothesWashingInterface;
    }

    private void useWater(int amountOfWater) {
        this.usageOfWater = usageOfWater + amountOfWater;
    }

    public void washDishes() {
        this.useWater(dishWashingInterface.washDishes());
    }

    public void washClothes() {
        this.useWater(clothesWashingInterface.washClothes());
    }

    public void takeAShower(int timeInMinutes) {
        this.useWater(timeInMinutes*3);
    }

    public abstract void intruduceYourself();
}
