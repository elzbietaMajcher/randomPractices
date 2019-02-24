package examplesInterfaces;

public class Rock implements NonMovableActivityClient {
    @Override
    public void onUseRequested() {
        System.out.println("Rock is used");
    }

    @Override
    public void soSomething(int value) {
        System.out.println("Sorry I am a rock, I can't do anything myself.");
    }

    public void test() {
        System.out.println("Test");
    }
}
