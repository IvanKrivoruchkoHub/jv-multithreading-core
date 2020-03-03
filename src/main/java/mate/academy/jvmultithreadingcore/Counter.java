package mate.academy.jvmultithreadingcore;

public class Counter {
    int value;

    public Counter() {
        this.value = 0;
    }

    public int  incrementValue() {
        return ++value;
    }
}
