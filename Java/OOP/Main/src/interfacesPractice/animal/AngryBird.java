package interfacesPractice.animal;

import interfacesPractice.Animal;
import interfacesPractice.interfaces.Flyable;

public class AngryBird extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("AngryBird is flying!");
    }
}
