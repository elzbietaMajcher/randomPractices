package exceptionExamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividedByZeroWithExceptionHandling {

    public static int quotient(int numerator, int denominator) throws ArithmeticException{
            return numerator / denominator;
        }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; //determine if more input is needed

        do {
            try{
                System.out.print("Please enter an integer number: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

                continueLoop = false;
               }catch (InputMismatchException inputMismatchException){
                System.out.printf("%nException: %s%n", inputMismatchException);
                scanner.nextLine();
                System.out.printf(
                        "You must enter integer. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException){
                System.out.printf("%nException: %s%n", arithmeticException);
                scanner.nextLine();
                System.out.printf(
                        "Dividing by 0 is forbidden. Please try again");
            }

        }while (continueLoop);

    }

}
