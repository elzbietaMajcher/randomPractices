package exceptionExamples;

public class UsingExceptions {

    public static void main(String[] args){

        try {
            throwException();
        }
        catch (Exception exception){
        System.err.println("Exception handled in main");
        }

        doesNotThrowException();
    }

    public static void throwException() throws Exception{
        try {
            System.out.println("Method throwException");
            throw new Exception();
        }catch (Exception exception){
            System.err.println("Exception handled in the method throwException in a block catch.");
            throw exception; // rethrow for further processing
        }finally {
            System.err.println("Finally executed in throwException");
        }
        //there can not be any code else
    }

    public static void doesNotThrowException(){
        try {
            System.out.println("Method doesn't throw any exception");
        }catch (Exception exception){
            System.out.println(exception);
        }finally {
            System.out.println("Finally block");
            //some block of code
        }
        System.out.println("Some block of instruction after try catch block.");
    }
}
