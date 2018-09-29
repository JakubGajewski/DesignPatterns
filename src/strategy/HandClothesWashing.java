package strategy;

public class HandClothesWashing implements ClothesWashingInterface {
    @Override
    public int washClothes() {
        System.out.println("Hand washing... Clothes are still not-as-clean");
        return 10;
    }
}
