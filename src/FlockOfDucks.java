package pl.jg.jelly.Composite;

import java.util.Collection;
import java.util.HashSet;

public class FlockOfDucks implements Duck {
    private Collection<Duck> ducks = new HashSet<>();

    @Override
    public void quack() {
        ducks.forEach(Duck::quack);
    }

    public void addDuck(Duck duck) {
        ducks.add(duck);
    }
}
