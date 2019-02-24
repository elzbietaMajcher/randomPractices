package examplesInterfaces;

public class AnimateActivityManager{

    public void accept(ActivityClient item) {
        item.soSomething(0); // here we are calling interface method
    }
}
