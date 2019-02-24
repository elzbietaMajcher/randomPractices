package arrayExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        MyOwnArrayList<String> myOwnArrayList = new MyOwnArrayList();
        for (int i = 0; i < 30; i++) {
            myOwnArrayList.add(String.valueOf(i));
        }

        for (int i = 0; i <myOwnArrayList.size() ; i++) {
            System.out.println(myOwnArrayList.getItems(i));
        }









        ArrayList<String> items = new ArrayList();
        items.add("Sammy");
        items.add("Hi");
        items.add("Hello");
        items.add("Joey");

        //items.add(1);

        for (String item : items) {
            System.out.println(item);
        }

        System.out.println(items.toString());

//        Collections.sort(items);
//        System.out.println(items);

        Collections.sort(items, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(0) < o2.charAt(0)) return -1;
                else
                    return 0;
            }
        });

        System.out.println(items);

    }
}
