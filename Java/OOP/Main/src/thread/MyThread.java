package thread;

public class MyThread extends Thread{
    @Override
    public void run() {

        try {
            System.out.println("Thread chay...");
            Thread.sleep(10000);
            System.out.println("Run with me!");
        } catch (InterruptedException interruptedException) {
            System.err.println("some thing wrong");
        }

    }
}
