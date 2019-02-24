package examplesInterfaces;

public class Car implements ActivityClient{

    @Override
    public void soSomething(int val) {
        System.out.println("I am driving " + val );
    }
}
