package examplesInterfaces;

public class Animal implements ActivityClient {

    @Override
    public void soSomething(int value) {
        System.out.println("I am running");
    }

    public void eat(){
        System.out.println("I am eating.");
    }

    public void walk(){
        System.out.println("I am walking");
    }
}
