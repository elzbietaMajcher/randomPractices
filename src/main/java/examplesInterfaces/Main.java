package examplesInterfaces;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("I am walking fast");
            }
        };

        //animal.eat();

        Rock rock = new Rock();
        //rock.onUseRequested();
        //rock.test();


        Car car = new Car();

        ActivityClient[] items =
                {
                        animal, car, rock
                };

//        for (ActivityClient item : items){
//            item.soSomething();
//            item.defaultActivity();
//        }

//////////////////////ANONYMOUS INNER CLASS////////////////////////////////////////////////////////////////////////////////
        AnimateActivityManager manager = new AnimateActivityManager();
        manager.accept(new ActivityClient() {
            @Override
            public void soSomething(int val) {
                System.out.println("Anonymous inner class being provided to method");
            }
        });
        ///////////////////////LAMBDA//////////////////////////////////

        manager.accept((val) -> {
            System.out.println("This is a lambda expression with value " + val);
        });
        ///////////////////////LAMBDA//////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////
        ActivityClient client = new ActivityClient() {
            @Override
            public void soSomething(int val) {
                System.out.println("This is anonymous inner class");
            }
        };
        client.soSomething(0); // we have to call interface object method
//////////////////////////////////////////////////////////////////////////////////////////////////////
        class CustomClass implements ActivityClient {

            @Override
            public void soSomething(int val) {
                System.out.println("This is intended to make the concept of anonymous inner class more clear.");
            }
        }
        CustomClass customClass = new CustomClass();
        customClass.soSomething(0);// we have to call object method
//////////////////////////////////////////////////////////////////////////////////////////////////////


    }
}
