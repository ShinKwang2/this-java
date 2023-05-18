package thread;

public class GetAndChangeThreadName {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());

        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread() {
                @Override
                public void run() {
                    System.out.println(getName() + " 실행");
                }
            };
             thread.run();
        }



        Thread chatThread = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + " 실행");
            }
        };
        chatThread.setName("chat-thread");
        chatThread.start();


    }
}
