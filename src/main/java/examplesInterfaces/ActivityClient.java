package examplesInterfaces;

public interface ActivityClient {

    void soSomething(int val); // interface abstract method, has to be override

    default void defaultActivity() // interface default method, can be override
    {
        System.out.println("Default interface method.");
    }

}
