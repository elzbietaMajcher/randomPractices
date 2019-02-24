package introToObjects;

public class MainObjects {

    public static void main (String[] args){

        Person person1 = new Person("Lucy", "pass1", 10);
        Person person2 = new Person("Joey", "pass2", 20);

//        Person[] peopleArray = new Person[10];
//
//        for (int i = 0; i < peopleArray.length; i++) {
//            peopleArray[i] = new Person("", i);
//        }
//
//        for (int i = 0; i < peopleArray.length; i++) {
//            System.out.println(i);
//        }

        person1.setMoney(100, "pass1");
        person2.setMoney(5, "incorrect");

        System.out.println(person1.getMoney());
        System.out.println(person2.getMoney());
    }
}
