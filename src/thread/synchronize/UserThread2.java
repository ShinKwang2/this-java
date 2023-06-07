package thread.synchronize;

public class UserThread2 extends Thread {

    private Calculator calculator;

    public UserThread2() {
        setName("userThread2");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemoryBySynchroBlock(50);
    }
}
