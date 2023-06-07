package thread.yield;

public class WorkThread extends Thread {

    public boolean work = true;

    public WorkThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true) {
            if (work) {
                System.out.println(getName() + ": 작업처리");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                Thread.yield();
            }
        }
    }
}
