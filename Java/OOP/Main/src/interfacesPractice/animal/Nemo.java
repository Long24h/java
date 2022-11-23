package interfacesPractice.animal;

import interfacesPractice.Animal;
import interfacesPractice.interfaces.Swimable;

public class Nemo extends Animal implements Swimable {
    @Override
    public void swim() {
        System.out.println("Nemo is swimming!");
    }
}
