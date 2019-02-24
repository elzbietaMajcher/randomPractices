package colectionsExamples;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Sally");
        linkedList.add("Anna");
        linkedList.add("Merry");
        System.out.println(((LinkedList<String>) linkedList).peekFirst());
        System.out.println();
        System.out.println(linkedList);

        linkedList.add("Adam");
        System.out.println(linkedList);

        linkedList.add(3,"Ugo");
        System.out.println(linkedList);
        ((LinkedList<String>) linkedList).push("Jon");
        System.out.println(linkedList);

    }
}
