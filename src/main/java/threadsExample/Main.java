package threadsExample;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static CountDownLatch latch = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {

        Malgosia malgosia = new Malgosia();
        Jas jas = new Jas();

        Thread malgosiaThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    malgosia.jogging();
                    malgosia.shower();
                    malgosia.eatBreakfast();
                    latch.countDown();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread jasThread = new Thread(new Jas());

        jasThread.start();
        malgosiaThread.start();

        latch.await();
        System.out.println();
        System.out.println("---Koniec dnia.---");

    }


}
