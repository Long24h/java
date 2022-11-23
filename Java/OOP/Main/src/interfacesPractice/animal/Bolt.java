package interfacesPractice.animal;

import interfacesPractice.Animal;
import interfacesPractice.interfaces.Barkable;
import interfacesPractice.interfaces.Runable;

public class Bolt extends Animal implements Runable, Barkable {
    @Override
    public void bark() {
        System.out.println("Bolt is barking at you!");
    }

    @Override
    public void run() {
        System.out.println("Bolt is running to bite you!");
    }
}
