package pl.jg.jelly.Composite;

public class WildDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("QUA!" + Math.random());
    }
}
