package mate.academy.jvmultithreadingcore;

public class RunnableTread implements Runnable {
    private Thread thread;
    private Counter counter;
    private String name;

    public RunnableTread(Counter counter, String name) {
        this.counter = counter;
        this.name = name;
        System.out.println("Creating " + name);
    }

    @Override
    public void run() {
        System.out.println("Running" + name);
        for (int i = 0; i < 100; i++) {
            System.out.println(name + ": " + counter.incrementValue());
        }
        System.out.println("Finishing" + name);
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
        } else {
            throw new IllegalThreadStateException("Can't called start more then one time");
        }
    }
}
