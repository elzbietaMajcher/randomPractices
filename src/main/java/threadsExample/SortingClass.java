package threadsExample;

import java.util.concurrent.Callable;

public class SortingClass {

    private static volatile boolean stopRequested = false;

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!Thread.interrupted())
                    i++;
            }
        });
        thread.start();
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();


    }


}
