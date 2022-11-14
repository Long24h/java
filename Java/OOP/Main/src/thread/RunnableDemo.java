package thread;

public class RunnableDemo extends Thread implements Runnable{
    private Thread thread;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Create " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }catch(InterruptedException interruptedException){
            System.out.println("thread " + threadName + " interruptedException");;
        }
        System.out.println("Thread " + threadName + " existing");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this.thread, threadName);
            thread.start();
        }
    }
}
