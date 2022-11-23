package interfacesPractice.machine;

import interfacesPractice.interfaces.Flyable;

public class Siddeley extends Machine implements Flyable {
    @Override
    public void fly() {
        System.out.println("Siddeley is flying!");
    }
}
