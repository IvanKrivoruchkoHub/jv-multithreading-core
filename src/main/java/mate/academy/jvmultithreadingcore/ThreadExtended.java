package mate.academy.jvmultithreadingcore;

public class ThreadExtended extends Thread {
    private Counter counter;
    private String name;

    public ThreadExtended(Counter counter, String name) {
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
}
