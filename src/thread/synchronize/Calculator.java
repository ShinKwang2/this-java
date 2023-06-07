package thread.synchronize;

public class Calculator {

    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemoryBySynchroMethod(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + ": " + this.memory);
    }

    public synchronized void setMemoryBySynchroBlock(int memory) {
        synchronized (this) {
            this.memory = memory;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + ": " + this.memory);
        }
    }
}
