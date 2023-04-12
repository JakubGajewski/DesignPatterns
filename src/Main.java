package pl.jg.jelly.Composite;

public class Main {


    public static void main(String[] args) {
        FlockOfDucks ducks = new FlockOfDucks();
        FlockOfDucks ducksChild1 = new FlockOfDucks();
        FlockOfDucks ducksChild2 = new FlockOfDucks();
        Duck first = new WildDuck();
        Duck second = new WildDuck();
        Duck third = new WildDuck();

        ducks.addDuck(ducksChild1);
        ducks.addDuck(ducksChild2);

        ducksChild1.addDuck(first);
        ducksChild1.addDuck(second);
        ducksChild2.addDuck(third);

        ducks.quack();


    }

}
