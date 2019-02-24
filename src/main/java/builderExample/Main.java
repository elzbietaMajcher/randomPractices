package builderExample;

import inheritanceExample.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        Someone someoneBuilder = new Someone.Builder()
                .name("Willy")
                .age(20)
                .address(new Someone.Address.Builder()
                        .street("298 Chick Drive")
                        .city("New York City")
                        .state("North York")
                        .create())
                .create();

        System.out.println(someoneBuilder.toString());

        Someone s2 = new Someone.Builder()
                .name("Billy")
                .age(20)
                .address(new Someone.Address.Builder()
                        .street("298 Chick Drive")
                        .city("New York City")
                        .state("North York")
                        .create())
                .create();

        Someone s3 = new Someone.Builder()
                .name("Lilly")
                .age(20)
                .address(new Someone.Address.Builder()
                        .street("298 Chick Drive")
                        .city("New York City")
                        .state("North York")
                        .create())
                .create();

        List<Someone> someoneList = new ArrayList<>(Arrays.asList(someoneBuilder, s2, s3));

        someoneList.forEach((item) -> {
            System.out.println(item.getName());
        });

        System.out.println("----------------------------------------");
        someoneList.stream()
                .filter((t) -> !t.getName().equals("Willy"))
                .forEach((t) -> System.out.println(t.getName()));



    }
}
