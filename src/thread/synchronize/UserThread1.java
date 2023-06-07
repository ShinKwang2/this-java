package thread.synchronize;

public class UserThread1 extends Thread {

    private Calculator calculator;

    public UserThread1() {
        setName("userThread1");
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemoryBySynchroMethod(100);
    }
}
