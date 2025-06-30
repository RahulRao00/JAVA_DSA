
class MultiThreading extends Thread {

    private int thread;

    public MultiThreading(int thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (thread == 3)
                throw new RuntimeException();
            System.out.println(i + "from thread " + thread);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}


public class Child {

    public static void main(String[] args) {

        // this run 5 thread a time
        for (int i = 0; i < 5; i++) {
            MultiThreading myThing2 = new MultiThreading(i);
            myThing2.start();
            // myThing2.join();
        }

    }


}