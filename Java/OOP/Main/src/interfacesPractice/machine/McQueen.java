package interfacesPractice.machine;

import interfacesPractice.interfaces.Runable;

public class McQueen extends Machine implements Runable {
    @Override
    public void run() {
        System.out.println("McQueen is running!");
    }
}
