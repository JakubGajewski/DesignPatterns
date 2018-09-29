package strategy;

public class MachineWashing implements ClothesWashingInterface {
    @Override
    public int washClothes() {
        System.out.println("WRRRR du dum du dum du dum, washing machine is working!");
        return 30;
    }
}
