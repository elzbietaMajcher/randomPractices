package threadsExample;

public class Malgosia {
    public void jogging() throws InterruptedException {
        System.out.println("Małgosia is jogging");
        Thread.sleep(3600);
    }

    public void shower() throws InterruptedException {
        System.out.println("Małgosia is taking shower.");
        Thread.sleep(120);
    }

    public void eatBreakfast() throws InterruptedException {
        System.out.println("Małgosia is eating");
        Thread.sleep(60);
    }

    public void goOut(){
        System.out.println("M is going out");
    }
}
