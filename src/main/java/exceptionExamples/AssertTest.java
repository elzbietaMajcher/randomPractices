package exceptionExamples;

import java.util.Scanner;

public class AssertTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 10: ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 10){
            System.out.printf("You entered %d%n", number);
        } else
            System.out.println("bad number: " + number);



    }
}
