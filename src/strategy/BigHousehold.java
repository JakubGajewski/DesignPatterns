package strategy;

public class BigHousehold extends Household {

    private int familyMembers = 10;

    public void giveABirth() {
        System.out.println("New kid on the block!");
        familyMembers++;
    }

    @Override
    public void intruduceYourself() {
        System.out.println("Hello, we are a very, very big family!");
    }

    public int getFamilyMembers() {
        return familyMembers;
    }
}
