public class Main {

    public static void  main (String[] args){
        System.out.println("Hello, word");

        int myInt = 20;
        double myDouble = 20.25;
        int sum = (int) (myInt + myDouble); //cast 40.25 --> 40

        boolean isRainy = true; // 0 = false, 1 = true

        if(isRainy){
            System.out.println("You need an umbrella");
        }

        int nine = 9;
        char myChar = '9';
        int mappedChar = (int) myChar;
        System.out.println(mappedChar);

        int f = 20;
        double r = 22;
        double result = f/r;
        System.out.println(result);
        ////////////////////////////////////////////////////////////////////////////

        String myString = " Nancy Reagan"; //string is a sequence of chars. A sequence of chars can be represented via an array.

        String weirdInitialization = new String("Nancy Reagan");

        boolean areEquals;
        areEquals = myString.equals(weirdInitialization); //true

        String nonImmutable = "Hello"; //[Hello] <--- nonImmutable, it is pointing in one block of memory
        nonImmutable.replace("l","o"); //[Hello] because String is immutable and is still pointing for the same block of memory
        nonImmutable = nonImmutable.replace("l","o"); // [Hello] --> new block of memory --->[Heooo} <--- nonImmutable




    }
}
