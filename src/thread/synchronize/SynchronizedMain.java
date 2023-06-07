package thread.synchronize;

public class SynchronizedMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        UserThread1 userThread1 = new UserThread1();
        userThread1.setCalculator(calculator);
        userThread1.start();

        UserThread2 userThread2 = new UserThread2();
        userThread2.setCalculator(calculator);
        userThread2.start();

    }
}
