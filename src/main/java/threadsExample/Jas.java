package threadsExample;

public class Jas implements Runnable {

    public void prepareBreakfast() throws InterruptedException {
        System.out.println("Jas is preparing and eating breakfast.");
        Thread.sleep(300);
    }

    public void takeShower() throws InterruptedException {
        System.out.println("Jas is taking shower.");
        Thread.sleep(1800);
    }

    public void dressUp() throws InterruptedException {
        System.out.println("Jas is dressing up.");
        Thread.sleep(60);
    }

    public void goOut() {
        System.out.println("M is going out");
    }

    @Override
    public void run() {
        try {
            prepareBreakfast();
            takeShower();
            dressUp();

            Main.latch.countDown();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
