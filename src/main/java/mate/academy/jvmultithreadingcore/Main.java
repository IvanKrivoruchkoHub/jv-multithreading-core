package mate.academy.jvmultithreadingcore;

public class Main {
    public static void main(String[] args) {
        Counter counter =  new Counter();
        RunnableTread thread1 = new RunnableTread(counter, "Thread1");
        Thread thread2 = new ThreadExtended(counter, "Thread2");
        thread1.start();
        thread2.start();
    }
}
